package defpackage;

import com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cuc {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public cuc(int i, int i2, long j, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }

    public static cuc b(String str) {
        byte[] bytes = (str + (char) 0).getBytes(cue.h);
        return new cuc(2, bytes.length, bytes);
    }

    public static cuc c(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[cue.f[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new cuc(4, 1, byteBufferWrap.array());
    }

    public static cuc d(cud cudVar, ByteOrder byteOrder) {
        cud[] cudVarArr = {cudVar};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[cue.f[5]]);
        byteBufferWrap.order(byteOrder);
        cud cudVar2 = cudVarArr[0];
        byteBufferWrap.putInt((int) cudVar2.a);
        byteBufferWrap.putInt((int) cudVar2.b);
        return new cuc(5, 1, byteBufferWrap.array());
    }

    public static cuc e(int i, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[cue.f[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i}[0]);
        return new cuc(3, 1, byteBufferWrap.array());
    }

    public final int a(ByteOrder byteOrder) throws Throwable {
        Object objF = f(byteOrder);
        if (objF == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objF instanceof String) {
            return Integer.parseInt((String) objF);
        }
        if (objF instanceof long[]) {
            long[] jArr = (long[]) objF;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objF instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objF;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0137: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:312), block:B:90:0x0137 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v10, types: [cud[]] */
    /* JADX WARN: Type inference failed for: r11v11, types: [int[]] */
    /* JADX WARN: Type inference failed for: r11v12, types: [int[]] */
    /* JADX WARN: Type inference failed for: r11v13, types: [cud[]] */
    /* JADX WARN: Type inference failed for: r11v14, types: [double[]] */
    /* JADX WARN: Type inference failed for: r11v16, types: [double[]] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v8, types: [int[]] */
    /* JADX WARN: Type inference failed for: r11v9, types: [long[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.Object f(java.nio.ByteOrder r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuc.f(java.nio.ByteOrder):java.lang.Object");
    }

    public final String toString() {
        return "(" + cue.e[this.a] + ", data length:" + this.d.length + ")";
    }

    public cuc(int i, int i2, byte[] bArr) {
        this(i, i2, -1L, bArr);
    }

    public final String g(ByteOrder byteOrder) throws Throwable {
        Object objF = f(byteOrder);
        if (objF != null) {
            if (objF instanceof String) {
                return (String) objF;
            }
            StringBuilder sb = new StringBuilder();
            boolean z = objF instanceof long[];
            String str = PJGqOKsIpSdZ.OZgONBPUd;
            int i = 0;
            if (z) {
                long[] jArr = (long[]) objF;
                while (true) {
                    int length = jArr.length;
                    if (i >= length) {
                        break;
                    }
                    sb.append(jArr[i]);
                    i++;
                    if (i != length) {
                        sb.append(str);
                    }
                }
            } else if (objF instanceof int[]) {
                int[] iArr = (int[]) objF;
                while (true) {
                    int length2 = iArr.length;
                    if (i >= length2) {
                        break;
                    }
                    sb.append(iArr[i]);
                    i++;
                    if (i != length2) {
                        sb.append(str);
                    }
                }
            } else if (objF instanceof double[]) {
                double[] dArr = (double[]) objF;
                while (true) {
                    int length3 = dArr.length;
                    if (i >= length3) {
                        break;
                    }
                    sb.append(dArr[i]);
                    i++;
                    if (i != length3) {
                        sb.append(str);
                    }
                }
            } else if (objF instanceof cud[]) {
                cud[] cudVarArr = (cud[]) objF;
                while (true) {
                    int length4 = cudVarArr.length;
                    if (i >= length4) {
                        break;
                    }
                    sb.append(cudVarArr[i].a);
                    sb.append('/');
                    sb.append(cudVarArr[i].b);
                    i++;
                    if (i != length4) {
                        sb.append(str);
                    }
                }
            } else {
                return null;
            }
            return sb.toString();
        }
        return null;
    }
}
