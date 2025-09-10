package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sfc extends sbv {
    public static final sbv a = new sfc(null, new Object[0], 0);
    private static final long serialVersionUID = 0;
    final transient Object[] b;
    public final transient int c;
    private final transient Object d;

    private sfc(Object obj, Object[] objArr, int i) {
        this.d = obj;
        this.b = objArr;
        this.c = i;
    }

    static sfc a(int i, Object[] objArr) {
        return g(i, objArr, null);
    }

    static sfc g(int i, Object[] objArr, sbr sbrVar) {
        if (i == 0) {
            return (sfc) a;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            Object obj2 = objArr[1];
            obj2.getClass();
            ujp.bo(obj, obj2);
            return new sfc(null, objArr, 1);
        }
        rnt.T(i, objArr.length >> 1);
        Object objU = u(objArr, i, scn.B(i), 0);
        if (objU instanceof Object[]) {
            Object[] objArr2 = (Object[]) objU;
            tdy tdyVar = (tdy) objArr2[2];
            if (sbrVar == null) {
                throw tdyVar.a();
            }
            sbrVar.c = tdyVar;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue + iIntValue);
            objU = obj3;
            i = iIntValue;
        }
        return new sfc(objU, objArr, i);
    }

    static Object i(Object[] objArr, int i, int i2, int i3) {
        Object objU = u(objArr, i, i2, i3);
        if (objU instanceof Object[]) {
            throw ((tdy) ((Object[]) objU)[2]).a();
        }
        return objU;
    }

    static Object k(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            obj3.getClass();
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            obj4.getClass();
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iBa = ujp.ba(obj2.hashCode());
            while (true) {
                int i3 = iBa & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                iBa = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iBa2 = ujp.ba(obj2.hashCode());
            while (true) {
                int i5 = iBa2 & length2;
                char c = (char) sArr[i5];
                if (c == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[c])) {
                    return objArr[c ^ 1];
                }
                iBa2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iBa3 = ujp.ba(obj2.hashCode());
            while (true) {
                int i6 = iBa3 & length3;
                int i7 = iArr[i6];
                if (i7 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i7])) {
                    return objArr[i7 ^ 1];
                }
                iBa3 = i6 + 1;
            }
        }
    }

    private static Object u(Object[] objArr, int i, int i2, int i3) {
        tdy tdyVar = null;
        if (i == 1) {
            Object obj = objArr[i3];
            obj.getClass();
            Object obj2 = objArr[i3 ^ 1];
            obj2.getClass();
            ujp.bo(obj, obj2);
            return null;
        }
        int i4 = i2 - 1;
        int i5 = 0;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i6 = 0;
            while (i5 < i) {
                int i7 = i5 + i5 + i3;
                int i8 = i6 + i6 + i3;
                Object obj3 = objArr[i7];
                obj3.getClass();
                Object obj4 = objArr[i7 ^ 1];
                obj4.getClass();
                ujp.bo(obj3, obj4);
                int iBa = ujp.ba(obj3.hashCode());
                while (true) {
                    int i9 = iBa & i4;
                    int i10 = bArr[i9] & 255;
                    if (i10 == 255) {
                        bArr[i9] = (byte) i8;
                        if (i6 < i5) {
                            objArr[i8] = obj3;
                            objArr[i8 ^ 1] = obj4;
                        }
                        i6++;
                    } else {
                        if (obj3.equals(objArr[i10])) {
                            int i11 = i10 ^ 1;
                            Object obj5 = objArr[i11];
                            obj5.getClass();
                            tdy tdyVar2 = new tdy(obj3, obj4, obj5);
                            objArr[i11] = obj4;
                            tdyVar = tdyVar2;
                            break;
                        }
                        iBa = i9 + 1;
                    }
                }
                i5++;
            }
            return i6 == i ? bArr : new Object[]{bArr, Integer.valueOf(i6), tdyVar};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i12 = 0;
            while (i5 < i) {
                int i13 = i5 + i5 + i3;
                int i14 = i12 + i12 + i3;
                Object obj6 = objArr[i13];
                obj6.getClass();
                Object obj7 = objArr[i13 ^ 1];
                obj7.getClass();
                ujp.bo(obj6, obj7);
                int iBa2 = ujp.ba(obj6.hashCode());
                while (true) {
                    int i15 = iBa2 & i4;
                    char c = (char) sArr[i15];
                    if (c == 65535) {
                        sArr[i15] = (short) i14;
                        if (i12 < i5) {
                            objArr[i14] = obj6;
                            objArr[i14 ^ 1] = obj7;
                        }
                        i12++;
                    } else {
                        if (obj6.equals(objArr[c])) {
                            int i16 = c ^ 1;
                            Object obj8 = objArr[i16];
                            obj8.getClass();
                            tdy tdyVar3 = new tdy(obj6, obj7, obj8);
                            objArr[i16] = obj7;
                            tdyVar = tdyVar3;
                            break;
                        }
                        iBa2 = i15 + 1;
                    }
                }
                i5++;
            }
            return i12 == i ? sArr : new Object[]{sArr, Integer.valueOf(i12), tdyVar};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i17 = 0;
        while (i5 < i) {
            int i18 = i5 + i5 + i3;
            int i19 = i17 + i17 + i3;
            Object obj9 = objArr[i18];
            obj9.getClass();
            Object obj10 = objArr[i18 ^ 1];
            obj10.getClass();
            ujp.bo(obj9, obj10);
            int iBa3 = ujp.ba(obj9.hashCode());
            while (true) {
                int i20 = iBa3 & i4;
                int i21 = iArr[i20];
                if (i21 == -1) {
                    iArr[i20] = i19;
                    if (i17 < i5) {
                        objArr[i19] = obj9;
                        objArr[i19 ^ 1] = obj10;
                    }
                    i17++;
                } else {
                    if (obj9.equals(objArr[i21])) {
                        int i22 = i21 ^ 1;
                        Object obj11 = objArr[i22];
                        obj11.getClass();
                        tdy tdyVar4 = new tdy(obj9, obj10, obj11);
                        objArr[i22] = obj10;
                        tdyVar = tdyVar4;
                        break;
                    }
                    iBa3 = i20 + 1;
                }
            }
            i5++;
        }
        return i17 == i ? iArr : new Object[]{iArr, Integer.valueOf(i17), tdyVar};
    }

    @Override // defpackage.sbv
    public final sbe f() {
        return new sfb(this.b, 1, this.c);
    }

    @Override // defpackage.sbv
    public final scn fC() {
        return new sez(this, this.b, 0, this.c);
    }

    @Override // defpackage.sbv
    public final scn fD() {
        return new sfa(this, new sfb(this.b, 0, this.c));
    }

    @Override // defpackage.sbv
    public final boolean fF() {
        return false;
    }

    @Override // defpackage.sbv, java.util.Map
    public final Object get(Object obj) {
        Object objK = k(this.d, this.b, this.c, 0, obj);
        if (objK == null) {
            return null;
        }
        return objK;
    }

    @Override // java.util.Map
    public final int size() {
        return this.c;
    }

    @Override // defpackage.sbv
    public Object writeReplace() {
        return super.writeReplace();
    }
}
