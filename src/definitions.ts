declare module "@capacitor/core" {
  interface PluginRegistry {
    CapTest: CapTestPlugin;
  }
}

export interface CapTestPlugin {
  echo(options: { value: string }): Promise<{value: string}>;
  add(options: { value1: string, value2: string}): Promise<{result: string}>;
  sub(options: { value1: string, value2: string}): Promise<{result: string}>;
  mul(options: { value1: string, value2: string}): Promise<{result: string}>;
}
