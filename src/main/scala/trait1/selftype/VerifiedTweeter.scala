package com.wmm
package trait1.selftype

class VerifiedTweeter(val username_ : String) extends Tweeter with User {
  override def username(): String = s"VerifiedTweeter $username_"
}
