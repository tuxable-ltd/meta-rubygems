# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: train"
DESCRIPTION = "Transport interface to talk to different backends."
HOMEPAGE = "https://github.com/inspec/train"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-activesupport-native \
    rubygems-azure-graph-rbac-native \
    rubygems-azure-mgmt-key-vault-native \
    rubygems-azure-mgmt-resources-native \
    rubygems-azure-mgmt-security-native \
    rubygems-azure-mgmt-storage-native \
    rubygems-docker-api-native \
    rubygems-google-api-client-native \
    rubygems-googleauth-native \
    rubygems-inifile-native \
    rubygems-train-core-native \
    rubygems-train-winrm-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "79b911550ed9b3a3787c0e8d4d9bc476"
SRC_URI[sha256sum] = "c920e22369e45fe843f8763f1c1ab86014e9437ed28c36ea4f7845d9126d44d0"

GEM_NAME = "train"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-activesupport \
    rubygems-azure-graph-rbac \
    rubygems-azure-mgmt-key-vault \
    rubygems-azure-mgmt-resources \
    rubygems-azure-mgmt-security \
    rubygems-azure-mgmt-storage \
    rubygems-docker-api \
    rubygems-google-api-client \
    rubygems-googleauth \
    rubygems-inifile \
    rubygems-train-core \
    rubygems-train-winrm \
"

BBCLASSEXTEND = "native"
