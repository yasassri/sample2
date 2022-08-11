//Class Properties {
//   def WEB_SERVER
//   def DB_SERVER
//   def DB_NAME
//   def SITE_URL
  
//   def setEnvironments(ENV) {
//      switch (ENV) {
//       case 'site_01':
//          WEB_SERVER =  'site_01.someplace.org'
//          DB_SERVER =  'site_01.db.someplace.org'
//          DB_NAME =    'site_01_db'
//          SITE_URL =   'https://some-spiffy-name.org'
//       case 'site_02':
//          WEB_SERVER =  'site_02.someplace.org'
//          DB_SERVER =  'site_02.db.someplace.org'
//          DB_NAME =    'site_02_db'
//          SITE_URL =   'https://some-different-name.org'
//       default:
//          error("ERROR: Unknown environment.")
//     }
//  }
//}

def setEnvironments(ENV) {
 switch (ENV) {
  case 'site_01':
   def WEB_SERVER =  'site_01.someplace.org'
   def DB_SERVER =  'site_01.db.someplace.org'
   def DB_NAME =    'site_01_db'
   def SITE_URL =   'https://some-spiffy-name.org'
   break
  case 'site_02':
   def WEB_SERVER =  'site_02.someplace.org'
   def DB_SERVER =  'site_02.db.someplace.org'
   def DB_NAME =    'site_02_db'
   def SITE_URL =   'https://some-different-name.org'
   break
  default:
   error("ERROR: Unknown environment.")
   break
 }
}
return this
