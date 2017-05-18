# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://github.com/amcgee7/mycroft-core.git;protocol=https"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "900033b99e7ec7ac47fe39d635aaa6b8446e80d0"

S = "${WORKDIR}/git"

# NOTE: no Makefile found, unable to determine what needs to be done

do_configure () {
	# Specify any needed configure commands here
	:
}

do_compile () {
	# Specify compilation commands here
	:
}

do_install () {
	# Specify install commands here
	:
}

