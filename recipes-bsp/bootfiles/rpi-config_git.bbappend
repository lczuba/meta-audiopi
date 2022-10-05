do_deploy_append() {
  echo "dtparams=audio=off" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
  echo "dtoverlay=hifiberry-dacplus" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
}
