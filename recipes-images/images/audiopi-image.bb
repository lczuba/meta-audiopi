SUMMARY = "My Custom Image"
DESCRIPTION = "audioPi image"

LICENSE = "MIT"

#inherit core-image-minimal
inherit core-image

MACHINE = "raspberrypi4-64"
ENABLE_UART = "1"

#IMAGE_INSTALL_append = " alsa-lib alsa-utils alsa-plugin alsa-tools aplay"
IMAGE_INSTALL_append = " spotifyd"

INSTALL_append= "rpi-config"
IMAGE_FSTYPES = "tar.xz ext3 rpi-sdimg"

