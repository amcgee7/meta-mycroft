ssh-keygen -f "/home/amcgee7/.ssh/known_hosts" -R [localhost]:5555
sudo kvm -kernel tmp/deploy/images/qemux86-64/bzImage \
      -net nic \
      -net user,hostfwd=tcp::5555-:22 \
      -cpu core2duo \
      -hda tmp/deploy/images/qemux86-64/genivi-dev-platform-qemux86-64.ext4 \
      -vga vmware \
      -no-reboot \
      -soundhw ac97 \
      -m 512 \
      --append "vga=0 uvesafb.mode_option=640x480-32 root=/dev/hda rw mem=512M oprofile.timer=1" 

