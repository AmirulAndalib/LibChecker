/**
 * Copyright 2015 - 2016 KeepSafe Software, Inc.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.absinthe.libchecker.utils.elf;

import java.io.IOException;

public class Section64Header extends Elf.SectionHeader {
  public Section64Header(final ElfParser parser, final Elf.Header header, final long index)
    throws IOException {
    final long _offset = header.shoff + (index * header.shentsize);
    type = parser.readWord(_offset + 0x4);
    offset = parser.readLong(_offset + 0x18);
    size = parser.readLong(_offset + 0x20);
    link = parser.readWord(_offset + 0x28);
    info = parser.readWord(_offset + 0x2C);
    entsize = parser.readWord(_offset + 0x38);
  }
}
