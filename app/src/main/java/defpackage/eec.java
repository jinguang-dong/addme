package defpackage;

import java.io.PushbackReader;
import java.io.Reader;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eec extends PushbackReader {
    private int a;
    private int b;
    private int c;

    public eec(Reader reader) {
        super(reader, 8);
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    @Override // java.io.PushbackReader, java.io.FilterReader, java.io.Reader
    public final int read(char[] cArr, int i, int i2) {
        int i3;
        int i4;
        char[] cArr2 = new char[8];
        int i5 = 1;
        int i6 = i;
        int i7 = 1;
        int i8 = 0;
        int i9 = 0;
        while (i7 != 0 && i8 < i2) {
            i7 = super.read(cArr2, i9, i5) == i5 ? i5 : 0;
            if (i7 != 0) {
                char c = cArr2[i9];
                int i10 = this.a;
                if (i10 == 0) {
                    i3 = 1;
                    if (c == '&') {
                        this.a = 1;
                        c = '&';
                        i10 = 1;
                    }
                } else if (i10 != i5) {
                    int i11 = i5;
                    if (i10 != 2) {
                        if (i10 == 3) {
                            if ((c < '0' || c > '9') && ((c < 'a' || c > 'f') && (c < 'A' || c > 'F'))) {
                                if (c == ';') {
                                    if (eed.b((char) this.b)) {
                                        this.a = 0;
                                        i4 = this.b;
                                        c = (char) i4;
                                        i10 = 0;
                                        i3 = i11;
                                    } else {
                                        c = ';';
                                    }
                                }
                                this.a = 5;
                            } else {
                                this.b = (this.b * 16) + Character.digit(c, 16);
                                int i12 = this.c + 1;
                                this.c = i12;
                                if (i12 <= 4) {
                                    this.a = 3;
                                } else {
                                    this.a = 5;
                                }
                            }
                            i3 = i11;
                            i10 = 5;
                        } else if (i10 != 4) {
                            this.a = 0;
                            i10 = 0;
                            i3 = i11;
                        } else {
                            if (c < '0' || c > '9') {
                                if (c == ';') {
                                    if (eed.b((char) this.b)) {
                                        this.a = 0;
                                        i4 = this.b;
                                        c = (char) i4;
                                        i10 = 0;
                                        i3 = i11;
                                    } else {
                                        c = ';';
                                    }
                                }
                                this.a = 5;
                            } else {
                                this.b = (this.b * 10) + Character.digit(c, 10);
                                int i13 = this.c + 1;
                                this.c = i13;
                                if (i13 <= 5) {
                                    this.a = 4;
                                    i10 = 4;
                                    i3 = i11;
                                } else {
                                    this.a = 5;
                                }
                            }
                            i3 = i11;
                            i10 = 5;
                        }
                    } else if (c == 'x') {
                        this.b = 0;
                        this.c = 0;
                        this.a = 3;
                    } else {
                        if (c < '0' || c > '9') {
                            i10 = 5;
                            this.a = 5;
                        } else {
                            this.b = Character.digit(c, 10);
                            this.c = i11;
                            this.a = 4;
                            i10 = 4;
                        }
                        i3 = 1;
                    }
                    i10 = 3;
                    i3 = i11;
                } else if (c == '#') {
                    this.a = 2;
                    i10 = 2;
                    i3 = 1;
                } else {
                    this.a = 5;
                    i3 = 1;
                    i10 = 5;
                }
                if (i10 == 0) {
                    if (i3 == eed.b(c)) {
                        c = ' ';
                    }
                    cArr[i6] = c;
                    i8++;
                    i6++;
                } else {
                    i9++;
                    if (i10 == 5) {
                        unread(cArr2, 0, i9);
                    }
                }
                i9 = 0;
            } else {
                i3 = i5;
                if (i9 > 0) {
                    unread(cArr2, 0, i9);
                    this.a = 5;
                    i9 = 0;
                    i5 = i3;
                    i7 = i5;
                }
            }
            i5 = i3;
        }
        if (i8 > 0 || i7 != 0) {
            return i8;
        }
        return -1;
    }
}
