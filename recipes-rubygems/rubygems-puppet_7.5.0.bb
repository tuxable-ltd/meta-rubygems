# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: puppet"
DESCRIPTION = "Puppet, an automated configuration management tool"
HOMEPAGE = "https://github.com/puppetlabs/puppet"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=72bcf758cb771bfde198d175d9e48429"

SRC_URI_append = " \
    file://0001-Replace-URI.escape-with-CGI.escape.patch \
"

DEPENDS_class-native += "\
    rubygems-concurrent-ruby-native \
    rubygems-deep-merge-native \
    rubygems-facter-native \
    rubygems-fast-gettext-native \
    rubygems-hiera-native \
    rubygems-locale-native \
    rubygems-multi-json-native \
    rubygems-puppet-resource-api-native \
    rubygems-scanf-native \
    rubygems-semantic-puppet-native \
"

SRC_URI[md5sum] = "c1f5978661034b7e718e8866c372cc09"
SRC_URI[sha256sum] = "a8f029a794f47412e362f5cb04cdf6c4a50e60fe02c87abd3ee47a7ee92c9e0d"

GEM_NAME = "puppet"

inherit rubygems
inherit rubygentest
inherit pkgconfig

do_install_append() {
    # remove stuff we don't really need
    # also avoid additional dependencies from
    # creeping in
    rm -rf ${GEM_HOME}/gems/puppet-${PV}/ext/debian/rules
    rm -rf ${GEM_HOME}/gems/puppet-${PV}/ext/gentoo/init.d/puppetmaster
    rm -rf ${GEM_HOME}/gems/puppet-${PV}/ext/solaris/smf/puppet
}

RDEPENDS_${PN}_class-target += "\
    rubygems-concurrent-ruby \
    rubygems-deep-merge \
    rubygems-facter \
    rubygems-fast-gettext \
    rubygems-hiera \
    rubygems-locale \
    rubygems-multi-json \
    rubygems-puppet-resource-api \
    rubygems-scanf \
    rubygems-semantic-puppet \
"

BBCLASSEXTEND = "native"