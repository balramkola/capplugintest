import { WebPlugin } from '@capacitor/core';
import { CapTestPlugin } from './definitions';

export class CapTestWeb extends WebPlugin implements CapTestPlugin {
  constructor() {
    super({
      name: 'CapTest',
      platforms: ['web']
    });
  }
  add(options: { value1: string; value2: string; }): Promise<{ result: string; }> {
    throw new Error("Method not implemented.");
  }
  sub(options: { value1: string; value2: string; }): Promise<{ result: string; }> {
    throw new Error("Method not implemented.");
  }
  mul(options: { value1: string; value2: string; }): Promise<{ result: string; }> {
    throw new Error("Method not implemented.");
  }

  async echo(options: { value: string }): Promise<{value: string}> {
    console.log('ECHO', options);
    return options;
  }
}

const CapTest = new CapTestWeb();

export { CapTest };

import { registerWebPlugin } from '@capacitor/core';
registerWebPlugin(CapTest);
