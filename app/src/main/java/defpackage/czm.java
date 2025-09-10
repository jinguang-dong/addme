package defpackage;

import android.util.Pair;
import com.bumptech.glide.qd.MyBPCgKwEjJI;
import com.google.android.apps.camera.ui.zoomlock.Gx.nWEkBGOQPWQp;
import com.google.android.material.button.xlT.JvFFEwFNdCrxf;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class czm {
    static {
        sbp.s((byte) -66, (byte) 122, (byte) -49, (byte) -53, (byte) -105, (byte) -87, (byte) 66, (byte) -24, (byte) -100, (byte) 113, (byte) -103, (byte) -108, (byte) -111, (byte) -29, (byte) -81, (byte) -84);
    }

    public static ByteBuffer d(String str, String str2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.put(cza.d(str));
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.put(cza.d(str2));
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.flip();
        return com.n("hdlr", byteBufferAllocate);
    }

    public static ByteBuffer e(ByteBuffer... byteBufferArr) {
        return com.m("stbl", Arrays.asList(byteBufferArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0492 A[LOOP:5: B:188:0x048c->B:190:0x0492, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0518 A[LOOP:7: B:199:0x0512->B:201:0x0518, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x084a  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.nio.ByteBuffer g(java.util.List r61, defpackage.czo r62, int r63) {
        /*
            Method dump skipped, instructions count: 3096
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czm.g(java.util.List, czo, int):java.nio.ByteBuffer");
    }

    private static long h(long j, long j2) {
        return cza.a(j, j2, 1000000L, RoundingMode.HALF_UP);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.nio.ByteBuffer j(defpackage.cyr r18) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czm.j(cyr):java.nio.ByteBuffer");
    }

    private static ByteBuffer k(short s) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.put("    ".getBytes(StandardCharsets.UTF_8));
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.putShort(s);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.flip();
        return com.n("damr", byteBufferAllocate);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.nio.ByteBuffer l(defpackage.cyr r14) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czm.l(cyr):java.nio.ByteBuffer");
    }

    private static ByteBuffer m(int i) {
        ArrayDeque arrayDeque = new ArrayDeque();
        int i2 = 0;
        while (true) {
            arrayDeque.push(Byte.valueOf((byte) (i2 | (i & 127))));
            i >>= 7;
            if (i <= 0) {
                break;
            }
            i2 = 128;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(arrayDeque.size());
        while (!arrayDeque.isEmpty()) {
            byteBufferAllocate.put(((Byte) arrayDeque.removeFirst()).byteValue());
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static ByteBuffer n(cyr cyrVar) {
        int i;
        byte b;
        int iB;
        int iB2;
        int iB3;
        boolean z;
        int i2;
        int i3;
        int i4;
        List list = cyrVar.j;
        boolean z2 = true;
        coi.w(!list.isEmpty(), "csd-0 not found in the format for hvcC box.");
        byte[] bArr = (byte[]) list.get(0);
        coi.w(bArr.length > 0, "csd-0 is empty for hvcC box.");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferWrap.limit() + 200);
        sbp sbpVarT = coi.t(byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        while (true) {
            i = ((sex) sbpVarT).c;
            if (i5 >= i) {
                break;
            }
            ByteBuffer byteBuffer = (ByteBuffer) sbpVarT.get(i5);
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(byteBuffer.limit());
            int i6 = 0;
            for (int i7 = 0; i7 < byteBuffer.limit(); i7++) {
                if (byteBuffer.get(i7) != 3 || i6 < 2) {
                    byteBufferAllocate2.put(byteBuffer.get(i7));
                }
                i6 = byteBuffer.get(i7) == 0 ? i6 + 1 : 0;
            }
            byteBufferAllocate2.flip();
            arrayList.add(byteBufferAllocate2);
            i5++;
        }
        byteBufferAllocate.put((byte) 1);
        ByteBuffer byteBuffer2 = (ByteBuffer) arrayList.get(0);
        if (byteBuffer2.get(byteBuffer2.position()) != 64) {
            throw new IllegalArgumentException("First NALU in csd-0 is not the VPS.");
        }
        byteBufferAllocate.put(byteBuffer2.get(6));
        int i8 = 7;
        byteBufferAllocate.putInt(byteBuffer2.getInt(7));
        byteBufferAllocate.putInt(byteBuffer2.getInt(11));
        byteBufferAllocate.putShort(byteBuffer2.getShort(15));
        byteBufferAllocate.put(byteBuffer2.get(17));
        byteBufferAllocate.putShort((short) -4096);
        byteBufferAllocate.put((byte) -4);
        ByteBuffer byteBuffer3 = (ByteBuffer) sbpVarT.get(1);
        int iRemaining = byteBuffer3.remaining();
        byte[] bArr2 = new byte[iRemaining];
        byteBuffer3.get(bArr2);
        byteBuffer3.rewind();
        float[] fArr = czf.a;
        czi cziVar = new czi(bArr2, 0, iRemaining);
        cziVar.d();
        cziVar.a(6);
        int iA = cziVar.a(6);
        cziVar.a(3);
        czi cziVar2 = new czi(bArr2, 2, iRemaining);
        cziVar2.e(4);
        int iA2 = cziVar2.a(3);
        if (iA == 0 || iA2 != 7) {
            i8 = iA2;
            b = false;
        } else {
            b = true;
        }
        if (b == false) {
            cziVar2.d();
            int[] iArr = new int[6];
            cziVar2.a(2);
            cziVar2.f();
            cziVar2.a(5);
            for (int i9 = 0; i9 < 32; i9++) {
                cziVar2.f();
            }
            for (int i10 = 0; i10 < 6; i10++) {
                iArr[i10] = cziVar2.a(8);
            }
            cziVar2.a(8);
            int i11 = 0;
            for (int i12 = 0; i12 < i8; i12++) {
                if (cziVar2.f()) {
                    i11 += 88;
                }
                if (cziVar2.f()) {
                    i11 += 8;
                }
            }
            cziVar2.e(i11);
            if (i8 > 0) {
                int i13 = 8 - i8;
                cziVar2.e(i13 + i13);
            }
        }
        cziVar2.b();
        if (b == true) {
            if (cziVar2.f()) {
                cziVar2.a(8);
            }
            iB = 0;
            iB2 = 0;
            iB3 = 0;
        } else {
            iB = cziVar2.b();
            if (iB == 3) {
                cziVar2.d();
            }
            cziVar2.b();
            cziVar2.b();
            if (cziVar2.f()) {
                cziVar2.b();
                cziVar2.b();
                cziVar2.b();
                cziVar2.b();
            }
            iB2 = cziVar2.b();
            iB3 = cziVar2.b();
        }
        int iB4 = cziVar2.b();
        if (b == false) {
            int iMax = -1;
            for (int i14 = true != cziVar2.f() ? i8 : 0; i14 <= i8; i14++) {
                cziVar2.b();
                iMax = Math.max(cziVar2.b(), iMax);
                cziVar2.b();
            }
        }
        cziVar2.b();
        cziVar2.b();
        cziVar2.b();
        cziVar2.b();
        cziVar2.b();
        cziVar2.b();
        if (cziVar2.f()) {
            if (b == true && cziVar2.f()) {
                cziVar2.e(6);
            } else if (cziVar2.f()) {
                int i15 = 0;
                while (i15 < 4) {
                    for (int i16 = 0; i16 < 6; i16 += i15 == 3 ? 3 : 1) {
                        if (cziVar2.f()) {
                            int iMin = Math.min(64, 1 << ((i15 + i15) + 4));
                            if (i15 > 1) {
                                cziVar2.c();
                            }
                            for (int i17 = 0; i17 < iMin; i17++) {
                                cziVar2.c();
                            }
                        } else {
                            cziVar2.b();
                        }
                    }
                    i15++;
                }
            }
        }
        cziVar2.e(2);
        if (cziVar2.f()) {
            cziVar2.e(8);
            cziVar2.b();
            cziVar2.b();
            cziVar2.d();
        }
        int iB5 = cziVar2.b();
        int[] iArr2 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i18 = -1;
        int i19 = -1;
        int i20 = 0;
        while (i20 < iB5) {
            if (i20 == 0 || !cziVar2.f()) {
                z = z2;
                i2 = iB5;
                i3 = i20;
                int iB6 = cziVar2.b();
                int iB7 = cziVar2.b();
                int[] iArr3 = new int[iB6];
                int i21 = 0;
                while (i21 < iB6) {
                    iArr3[i21] = (i21 > 0 ? iArr3[i21 - 1] : 0) - (cziVar2.b() + 1);
                    cziVar2.d();
                    i21++;
                }
                int[] iArr4 = new int[iB7];
                int i22 = 0;
                while (i22 < iB7) {
                    iArr4[i22] = (i22 > 0 ? iArr4[i22 - 1] : 0) + cziVar2.b() + 1;
                    cziVar2.d();
                    i22++;
                }
                i18 = iB6;
                i19 = iB7;
                iArrCopyOf = iArr4;
                iArr2 = iArr3;
            } else {
                int i23 = i18 + i19;
                boolean zF = cziVar2.f();
                int iB8 = cziVar2.b() + 1;
                int i24 = 1 - ((zF ? 1 : 0) + (zF ? 1 : 0));
                z = z2;
                int i25 = i23 + 1;
                i2 = iB5;
                boolean[] zArr = new boolean[i25];
                for (int i26 = 0; i26 <= i23; i26++) {
                    if (cziVar2.f()) {
                        zArr[i26] = z;
                    } else {
                        zArr[i26] = cziVar2.f();
                    }
                }
                int i27 = i19 - 1;
                int[] iArr5 = new int[i25];
                int[] iArr6 = new int[i25];
                int i28 = 0;
                while (true) {
                    i4 = i24 * iB8;
                    if (i27 < 0) {
                        break;
                    }
                    int i29 = iArrCopyOf[i27] + i4;
                    if (i29 < 0 && zArr[i18 + i27]) {
                        iArr5[i28] = i29;
                        i28++;
                    }
                    i27--;
                }
                if (i4 < 0 && zArr[i23]) {
                    iArr5[i28] = i4;
                    i28++;
                }
                i3 = i20;
                int i30 = i28;
                for (int i31 = 0; i31 < i18; i31++) {
                    int i32 = iArr2[i31] + i4;
                    if (i32 < 0 && zArr[i31]) {
                        iArr5[i30] = i32;
                        i30++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr5, i30);
                int i33 = 0;
                for (int i34 = i18 - 1; i34 >= 0; i34--) {
                    int i35 = iArr2[i34] + i4;
                    if (i35 > 0 && zArr[i34]) {
                        iArr6[i33] = i35;
                        i33++;
                    }
                }
                if (i4 > 0 && zArr[i23]) {
                    iArr6[i33] = i4;
                    i33++;
                }
                for (int i36 = 0; i36 < i19; i36++) {
                    int i37 = iArrCopyOf[i36] + i4;
                    if (i37 > 0 && zArr[i18 + i36]) {
                        iArr6[i33] = i37;
                        i33++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr6, i33);
                iArr2 = iArrCopyOf2;
                i18 = i30;
                i19 = i33;
            }
            i20 = i3 + 1;
            z2 = z;
            iB5 = i2;
        }
        boolean z3 = z2;
        if (cziVar2.f()) {
            int iB9 = cziVar2.b();
            for (int i38 = 0; i38 < iB9; i38++) {
                cziVar2.e(iB4 + 5);
            }
        }
        cziVar2.e(2);
        if (cziVar2.f()) {
            if (cziVar2.f()) {
                int iA3 = cziVar2.a(8);
                if (iA3 == 255) {
                    cziVar2.a(16);
                    cziVar2.a(16);
                } else if (iA3 < 17) {
                    float f = czf.a[iA3];
                } else {
                    cyy.b("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iA3);
                }
            }
            if (cziVar2.f()) {
                cziVar2.d();
            }
            if (cziVar2.f()) {
                cziVar2.e(3);
                cziVar2.f();
                if (cziVar2.f()) {
                    cziVar2.a(8);
                    cziVar2.a(8);
                    cziVar2.e(8);
                    int i39 = cyp.e;
                }
            }
            if (cziVar2.f()) {
                cziVar2.b();
                cziVar2.b();
            }
            cziVar2.d();
            cziVar2.f();
        }
        byteBufferAllocate.put((byte) (iB | 252));
        byteBufferAllocate.put((byte) (iB2 | 248));
        byteBufferAllocate.put((byte) (iB3 | 248));
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.put((byte) 15);
        byteBufferAllocate.put((byte) i);
        for (int i40 = 0; i40 < i; i40++) {
            ByteBuffer byteBuffer4 = (ByteBuffer) sbpVarT.get(i40);
            byteBufferAllocate.put((byte) ((byteBuffer4.get(0) >> 1) & 63));
            byteBufferAllocate.putShort(z3 ? (short) 1 : (short) 0);
            byteBufferAllocate.putShort((short) byteBuffer4.limit());
            byteBufferAllocate.put(byteBuffer4);
        }
        byteBufferAllocate.flip();
        return com.n("hvcC", byteBufferAllocate);
    }

    private static ByteBuffer o(long j, long j2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(20);
        byteBufferAllocate.putLong(j);
        byteBufferAllocate.putLong(j2);
        byteBufferAllocate.putShort((short) 1);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    private static rfv p(cyr cyrVar) throws NumberFormatException {
        int i;
        int i2;
        rfv rfvVarL = rfv.l(new cyz((byte[]) ujp.aQ(cyrVar.j)));
        if (rfvVarL != null || cyrVar.g == null) {
            return rfvVarL;
        }
        Pair pairA = a(cyrVar);
        coi.A(pairA, "Dolby Vision profile and level is not found.");
        int iIntValue = ((Integer) pairA.first).intValue();
        int iIntValue2 = ((Integer) pairA.second).intValue();
        Pattern pattern = cyw.a;
        byte[] bArr = new byte[24];
        if (iIntValue == 8) {
            i = 4;
            i2 = 0;
        } else if (iIntValue == 9) {
            iIntValue = 9;
            i = 2;
            i2 = 1;
        } else {
            i = 0;
            i2 = 0;
        }
        bArr[0] = 1;
        bArr[1] = 0;
        int i3 = iIntValue & 127;
        bArr[2] = (byte) ((((byte) (i3 + i3)) | ((iIntValue2 >> 5) & 1)) & 255);
        bArr[3] = (byte) (((byte) (((byte) ((iIntValue2 & 31) << 3)) | 4)) | 1);
        bArr[4] = (byte) ((i << 4) | (i2 << 2));
        return rfv.l(new cyz(bArr));
    }

    static Pair a(cyr cyrVar) throws NumberFormatException {
        String str = cyrVar.g;
        coi.A(str, "Codec string is null for Dolby Vision format.");
        List listF = rwr.b('.').f(str);
        if (listF.size() < 3) {
            cyy.b("Boxes", nWEkBGOQPWQp.kXMOlhwKdEKx.concat(String.valueOf(str)));
            return null;
        }
        return Pair.create(Integer.valueOf(Integer.parseInt((String) listF.get(1))), Integer.valueOf(Integer.parseInt((String) listF.get(2))));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0930  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.nio.ByteBuffer b(defpackage.cyr r27) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 3568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czm.b(cyr):java.nio.ByteBuffer");
    }

    public static ByteBuffer c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ByteBuffer.wrap(cza.d("isom")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(131072);
        byteBufferAllocate.flip();
        arrayList.add(byteBufferAllocate);
        String[] strArr = {"isom", "iso2", JvFFEwFNdCrxf.aFgzediLHIizxR};
        for (int i = 0; i < 3; i++) {
            arrayList.add(ByteBuffer.wrap(cza.d(strArr[i])));
        }
        return com.m("ftyp", arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String i(defpackage.cyr r8) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czm.i(cyr):java.lang.String");
    }

    public static ByteBuffer f(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.limit() + 200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(1);
        byteBufferAllocate.put(byteBuffer);
        byteBufferAllocate.flip();
        return com.n(MyBPCgKwEjJI.RTJTHcAdk, byteBufferAllocate);
    }
}
