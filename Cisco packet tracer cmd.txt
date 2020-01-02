# for switch

> en
> configure terminal
> interface fastethernet 0/n
> switchport access vlan 102
> switchpost mode trunk [switch-switch connection]
> do wr

# for router

> en
> configure terminal
> interface gigabitLan 1/0
> ip adrress <ip> <subnet mast>
> ip route <destinition network+mask> <next router ip>
> no shutdown
 