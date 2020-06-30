
  Pod::Spec.new do |s|
    s.name = 'CapTest'
    s.version = '0.0.1'
    s.summary = 'Capacitor Test Plugin'
    s.license = 'Apache 2'
    s.homepage = 'cap-test'
    s.author = 'Balram Kola'
    s.source = { :git => 'cap-test', :tag => s.version.to_s }
    s.source_files = 'ios/Plugin/**/*.{swift,h,m,c,cc,mm,cpp}'
    s.ios.deployment_target  = '11.0'
    s.dependency 'Capacitor'
  end