@Grab('org.apache.commons:commons-math3:3.4.1')
import org.apache.commons.math3.primes.Primes

def info(msg) {
  echo "INFO: $msg"
}

def warn(msg) {
  echo "WARN: $msg"
}

def isPrime(num) {
  return Primes.isPrime(num)
}
