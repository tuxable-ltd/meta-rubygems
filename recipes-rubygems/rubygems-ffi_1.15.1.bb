# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: ffi"
DESCRIPTION = "Ruby FFI library"
HOMEPAGE = "https://github.com/ffi/ffi/wiki"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=0b4e3af2fd54eb00a94b967e6b927818"

EXTRA_RDEPENDS_append = " \
    libffi \
"

GEM_INSTALL_FLAGS:append = " \
    --enable-system-libffi \
    --with-opt-dir=${RECIPE_SYSROOT} \
"

SRC_URI[md5sum] = "63f782c2c7dc4db127da72b5bcec53c6"
SRC_URI[sha256sum] = "d125ee6a8b88405926f8af9b3d25a75ae93e1c782cd50bd62e81e20cce16d696"

GEM_NAME = "ffi"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"