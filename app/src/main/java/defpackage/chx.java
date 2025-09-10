package defpackage;

import android.content.ContentProviderClient;
import android.graphics.Path;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.ar.core.ImageMetadata;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chx {
    public static final void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void b(String str) {
        throw new IllegalStateException(str);
    }

    public static final chz c(bkg bkgVar) {
        float f = bkgVar.e;
        float f2 = bkgVar.d;
        return new chz(Math.round(bkgVar.b), Math.round(bkgVar.c), Math.round(f2), Math.round(f));
    }

    public static ckg d(cjn cjnVar, int i, ArrayList arrayList, ckg ckgVar) {
        int i2;
        int i3 = i == 0 ? cjnVar.ao : cjnVar.ap;
        if (i3 != -1 && (ckgVar == null || i3 != ckgVar.c)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                ckg ckgVar2 = (ckg) arrayList.get(i4);
                if (ckgVar2.c == i3) {
                    if (ckgVar != null) {
                        ckgVar.c(i, ckgVar2);
                        arrayList.remove(ckgVar);
                    }
                    ckgVar = ckgVar2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return ckgVar;
        }
        if (ckgVar == null) {
            if (cjnVar instanceof cjr) {
                cjr cjrVar = (cjr) cjnVar;
                int i5 = 0;
                while (true) {
                    if (i5 >= cjrVar.as) {
                        i2 = -1;
                        break;
                    }
                    cjn cjnVar2 = cjrVar.ar[i5];
                    if (i == 0) {
                        i2 = cjnVar2.ao;
                        if (i2 != -1) {
                            break;
                        }
                        i5++;
                    } else {
                        i2 = cjnVar2.ap;
                        if (i2 != -1) {
                            break;
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        ckg ckgVar3 = (ckg) arrayList.get(i6);
                        if (ckgVar3.c == i2) {
                            ckgVar = ckgVar3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (ckgVar == null) {
                ckgVar = new ckg(i);
            }
            arrayList.add(ckgVar);
        }
        if (ckgVar.d(cjnVar)) {
            if (cjnVar instanceof cjq) {
                cjq cjqVar = (cjq) cjnVar;
                cjqVar.d.c(cjqVar.ar == 0 ? 1 : 0, arrayList, ckgVar);
            }
            if (i == 0) {
                cjnVar.ao = ckgVar.c;
                cjnVar.J.c(0, arrayList, ckgVar);
                cjnVar.L.c(0, arrayList, ckgVar);
            } else {
                cjnVar.ap = ckgVar.c;
                cjnVar.K.c(1, arrayList, ckgVar);
                cjnVar.N.c(1, arrayList, ckgVar);
                cjnVar.M.c(1, arrayList, ckgVar);
            }
            cjnVar.Q.c(i, arrayList, ckgVar);
        }
        return ckgVar;
    }

    public static ckg e(ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ckg ckgVar = (ckg) arrayList.get(i2);
            if (i == ckgVar.c) {
                return ckgVar;
            }
        }
        return null;
    }

    public static boolean f(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static final void h(ContentProviderClient contentProviderClient) throws Exception {
        if (contentProviderClient != null) {
            contentProviderClient.close();
        }
    }

    public static /* synthetic */ List i(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            arrayList.add(obj);
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static Path j(String str) {
        Path path = new Path();
        try {
            k(l(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(String.valueOf(str)), e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public static void k(cmi[] cmiVarArr, Path path) {
        int i;
        float[] fArr;
        int i2;
        cmi cmiVar;
        int i3;
        char c;
        int i4;
        float f;
        boolean z;
        float f2;
        float f3;
        cmi cmiVar2;
        boolean z2;
        float f4;
        float f5;
        float f6;
        float f7;
        boolean z3;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        cmi[] cmiVarArr2 = cmiVarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = cmiVarArr2.length;
        int i5 = 0;
        int i6 = 0;
        char c2 = 'm';
        while (i6 < length) {
            cmi cmiVar3 = cmiVarArr2[i6];
            char c3 = cmiVar3.a;
            float[] fArr3 = cmiVar3.b;
            float f15 = fArr2[i5];
            float f16 = fArr2[1];
            float f17 = fArr2[2];
            float f18 = fArr2[3];
            float f19 = fArr2[4];
            int i7 = i5;
            float f20 = fArr2[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i = 2;
                    break;
                case 'Q':
                case 'S':
                case ScriptIntrinsicBLAS.CONJ_TRANSPOSE /* 113 */:
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case ScriptIntrinsicBLAS.LOWER /* 122 */:
                    path2.close();
                    path2.moveTo(f19, f20);
                    f15 = f19;
                    f17 = f15;
                    f16 = f20;
                    f18 = f16;
                    i = 2;
                    break;
            }
            float f21 = f19;
            float f22 = f20;
            float f23 = f15;
            float f24 = f16;
            int i8 = i7;
            while (i8 < fArr3.length) {
                if (c3 == 'A') {
                    fArr = fArr3;
                    i2 = i8;
                    cmiVar = cmiVar3;
                    float f25 = f23;
                    float f26 = f24;
                    i3 = i6;
                    c = c3;
                    int i9 = i2 + 6;
                    int i10 = i2 + 5;
                    int i11 = i2 + 4;
                    float f27 = fArr[i10];
                    float f28 = fArr[i9];
                    float f29 = fArr[i2];
                    float f30 = fArr[i2 + 1];
                    float f31 = fArr[i2 + 2];
                    if (fArr[i2 + 3] != 0.0f) {
                        i4 = i11;
                        f = f30;
                        z = 1;
                    } else {
                        i4 = i11;
                        f = f30;
                        z = i7;
                    }
                    cmi.a(path, f25, f26, f27, f28, f29, f, f31, z, fArr[i4] != 0.0f ? 1 : i7);
                    f17 = fArr[i10];
                    f2 = fArr[i9];
                    f18 = f2;
                    f3 = f17;
                } else if (c3 == 'C') {
                    fArr = fArr3;
                    i2 = i8;
                    i3 = i6;
                    cmiVar = cmiVar3;
                    c = c3;
                    int i12 = i2 + 5;
                    int i13 = i2 + 4;
                    int i14 = i2 + 3;
                    int i15 = i2 + 2;
                    path2.cubicTo(fArr[i2], fArr[i2 + 1], fArr[i15], fArr[i14], fArr[i13], fArr[i12]);
                    float f32 = fArr[i13];
                    float f33 = fArr[i12];
                    f17 = fArr[i15];
                    f18 = fArr[i14];
                    f2 = f33;
                    f3 = f32;
                } else if (c3 == 'H') {
                    fArr = fArr3;
                    i2 = i8;
                    cmiVar = cmiVar3;
                    c = c3;
                    f2 = f24;
                    i3 = i6;
                    path2.lineTo(fArr[i2], f2);
                    f3 = fArr[i2];
                } else if (c3 == 'Q') {
                    fArr = fArr3;
                    i2 = i8;
                    i3 = i6;
                    cmiVar = cmiVar3;
                    c = c3;
                    int i16 = i2 + 3;
                    int i17 = i2 + 2;
                    int i18 = i2 + 1;
                    path2.quadTo(fArr[i2], fArr[i18], fArr[i17], fArr[i16]);
                    float f34 = fArr[i2];
                    float f35 = fArr[i18];
                    f3 = fArr[i17];
                    f18 = f35;
                    f2 = fArr[i16];
                    f17 = f34;
                } else if (c3 == 'V') {
                    fArr = fArr3;
                    i2 = i8;
                    i3 = i6;
                    cmiVar = cmiVar3;
                    f3 = f23;
                    c = c3;
                    path2.lineTo(f3, fArr[i2]);
                    f2 = fArr[i2];
                } else if (c3 != 'a') {
                    if (c3 == 'c') {
                        fArr = fArr3;
                        i2 = i8;
                        int i19 = i2 + 5;
                        int i20 = i2 + 4;
                        int i21 = i2 + 3;
                        int i22 = i2 + 2;
                        path2.rCubicTo(fArr[i2], fArr[i2 + 1], fArr[i22], fArr[i21], fArr[i20], fArr[i19]);
                        float f36 = fArr[i22] + f23;
                        float f37 = fArr[i21] + f24;
                        f23 += fArr[i20];
                        f24 += fArr[i19];
                        f17 = f36;
                        f18 = f37;
                    } else if (c3 == 'h') {
                        fArr = fArr3;
                        i2 = i8;
                        path2.rLineTo(fArr[i2], 0.0f);
                        f23 += fArr[i2];
                    } else if (c3 != 'q') {
                        if (c3 != 'v') {
                            if (c3 != 'L') {
                                if (c3 == 'M') {
                                    fArr = fArr3;
                                    i2 = i8;
                                    f9 = fArr[i2];
                                    f10 = fArr[i2 + 1];
                                    if (i2 > 0) {
                                        path2.lineTo(f9, f10);
                                    } else {
                                        path2.moveTo(f9, f10);
                                        f21 = f9;
                                        f2 = f10;
                                        f22 = f2;
                                        i3 = i6;
                                        c = c3;
                                        f3 = f21;
                                    }
                                } else if (c3 == 'S') {
                                    fArr = fArr3;
                                    i2 = i8;
                                    int i23 = i2 + 3;
                                    int i24 = i2 + 2;
                                    int i25 = i2 + 1;
                                    if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                        f24 = (f24 + f24) - f18;
                                        f23 = (f23 + f23) - f17;
                                    }
                                    path2.cubicTo(f23, f24, fArr[i2], fArr[i25], fArr[i24], fArr[i23]);
                                    f17 = fArr[i2];
                                    f18 = fArr[i25];
                                    f3 = fArr[i24];
                                    i3 = i6;
                                    c = c3;
                                    f2 = fArr[i23];
                                } else if (c3 == 'T') {
                                    fArr = fArr3;
                                    i2 = i8;
                                    int i26 = i2 + 1;
                                    if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                        f24 = (f24 + f24) - f18;
                                        f23 = (f23 + f23) - f17;
                                    }
                                    path2.quadTo(f23, f24, fArr[i2], fArr[i26]);
                                    float f38 = fArr[i2];
                                    f2 = fArr[i26];
                                    f17 = f23;
                                    f18 = f24;
                                    f3 = f38;
                                    i3 = i6;
                                    cmiVar = cmiVar3;
                                    c = c3;
                                } else if (c3 == 'l') {
                                    fArr = fArr3;
                                    i2 = i8;
                                    int i27 = i2 + 1;
                                    path2.rLineTo(fArr[i2], fArr[i27]);
                                    f23 += fArr[i2];
                                    f8 = fArr[i27];
                                } else if (c3 == 'm') {
                                    fArr = fArr3;
                                    i2 = i8;
                                    float f39 = fArr[i2];
                                    f23 += f39;
                                    float f40 = fArr[i2 + 1];
                                    f24 += f40;
                                    if (i2 > 0) {
                                        path2.rLineTo(f39, f40);
                                    } else {
                                        path2.rMoveTo(f39, f40);
                                        cmiVar = cmiVar3;
                                        f3 = f23;
                                        f21 = f3;
                                        f2 = f24;
                                        f22 = f2;
                                        i3 = i6;
                                        c = c3;
                                    }
                                } else if (c3 != 's') {
                                    if (c3 == 't') {
                                        int i28 = i8 + 1;
                                        if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                            f13 = f24 - f18;
                                            f14 = f23 - f17;
                                        } else {
                                            f13 = 0.0f;
                                            f14 = 0.0f;
                                        }
                                        path2.rQuadTo(f14, f13, fArr3[i8], fArr3[i28]);
                                        float f41 = f14 + f23;
                                        float f42 = f13 + f24;
                                        f23 += fArr3[i8];
                                        f24 += fArr3[i28];
                                        f18 = f42;
                                        f17 = f41;
                                    }
                                    fArr = fArr3;
                                    i2 = i8;
                                    cmiVar = cmiVar3;
                                    f3 = f23;
                                    f2 = f24;
                                    i3 = i6;
                                    c = c3;
                                } else {
                                    int i29 = i8 + 3;
                                    int i30 = i8 + 2;
                                    int i31 = i8 + 1;
                                    if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                        f11 = f24 - f18;
                                        f12 = f23 - f17;
                                    } else {
                                        f12 = 0.0f;
                                        f11 = 0.0f;
                                    }
                                    int i32 = i8;
                                    fArr = fArr3;
                                    i2 = i32;
                                    path2.rCubicTo(f12, f11, fArr3[i32], fArr3[i31], fArr3[i30], fArr3[i29]);
                                    float f43 = fArr[i2] + f23;
                                    float f44 = fArr[i31] + f24;
                                    f23 += fArr[i30];
                                    f24 += fArr[i29];
                                    f17 = f43;
                                    f18 = f44;
                                }
                                cmiVar = cmiVar3;
                            } else {
                                fArr = fArr3;
                                i2 = i8;
                                int i33 = i2 + 1;
                                path2.lineTo(fArr[i2], fArr[i33]);
                                f9 = fArr[i2];
                                f10 = fArr[i33];
                            }
                            f2 = f10;
                            i3 = i6;
                            c = c3;
                            f3 = f9;
                            cmiVar = cmiVar3;
                        } else {
                            fArr = fArr3;
                            i2 = i8;
                            path2.rLineTo(0.0f, fArr[i2]);
                            f8 = fArr[i2];
                        }
                        f24 += f8;
                    } else {
                        fArr = fArr3;
                        i2 = i8;
                        int i34 = i2 + 3;
                        int i35 = i2 + 2;
                        int i36 = i2 + 1;
                        path2.rQuadTo(fArr[i2], fArr[i36], fArr[i35], fArr[i34]);
                        float f45 = fArr[i2] + f23;
                        float f46 = fArr[i36] + f24;
                        f23 += fArr[i35];
                        f24 += fArr[i34];
                        f18 = f46;
                        f17 = f45;
                    }
                    cmiVar = cmiVar3;
                    f3 = f23;
                    f2 = f24;
                    i3 = i6;
                    c = c3;
                } else {
                    fArr = fArr3;
                    i2 = i8;
                    int i37 = i2 + 6;
                    int i38 = i2 + 5;
                    int i39 = i2 + 4;
                    float f47 = fArr[i38] + f23;
                    float f48 = fArr[i37] + f24;
                    float f49 = fArr[i2];
                    float f50 = fArr[i2 + 1];
                    float f51 = fArr[i2 + 2];
                    if (fArr[i2 + 3] != 0.0f) {
                        cmiVar2 = cmiVar3;
                        z2 = 1;
                    } else {
                        cmiVar2 = cmiVar3;
                        z2 = i7;
                    }
                    if (fArr[i39] != 0.0f) {
                        f4 = f50;
                        f5 = f24;
                        i3 = i6;
                        f6 = f51;
                        f7 = f23;
                        c = c3;
                        z3 = 1;
                    } else {
                        f4 = f50;
                        f5 = f24;
                        i3 = i6;
                        f6 = f51;
                        f7 = f23;
                        c = c3;
                        z3 = i7;
                    }
                    cmiVar = cmiVar2;
                    cmi.a(path, f7, f5, f47, f48, f49, f4, f6, z2, z3);
                    f3 = f7 + fArr[i38];
                    f2 = f5 + fArr[i37];
                    f17 = f3;
                    f18 = f2;
                }
                i8 = i2 + i;
                path2 = path;
                cmiVar3 = cmiVar;
                c3 = c;
                i6 = i3;
                f23 = f3;
                f24 = f2;
                c2 = c3;
                fArr3 = fArr;
            }
            fArr2[i7] = f23;
            fArr2[1] = f24;
            fArr2[2] = f17;
            fArr2[3] = f18;
            fArr2[4] = f21;
            fArr2[5] = f22;
            c2 = cmiVar3.a;
            i6++;
            cmiVarArr2 = cmiVarArr;
            path2 = path;
            i5 = i7;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b1 A[Catch: NumberFormatException -> 0x00d4, LOOP:3: B:32:0x0084->B:51:0x00b1, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00d4, blocks: (B:29:0x0070, B:32:0x0084, B:34:0x008a, B:38:0x0096, B:51:0x00b1, B:53:0x00b7, B:56:0x00c8, B:58:0x00cd), top: B:67:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7 A[Catch: NumberFormatException -> 0x00d4, TryCatch #0 {NumberFormatException -> 0x00d4, blocks: (B:29:0x0070, B:32:0x0084, B:34:0x008a, B:38:0x0096, B:51:0x00b1, B:53:0x00b7, B:56:0x00c8, B:58:0x00cd), top: B:67:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c8 A[Catch: NumberFormatException -> 0x00d4, TryCatch #0 {NumberFormatException -> 0x00d4, blocks: (B:29:0x0070, B:32:0x0084, B:34:0x008a, B:38:0x0096, B:51:0x00b1, B:53:0x00b7, B:56:0x00c8, B:58:0x00cd), top: B:67:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.cmi[] l(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chx.l(java.lang.String):cmi[]");
    }

    public static cmi[] m(cmi[] cmiVarArr) {
        cmi[] cmiVarArr2 = new cmi[cmiVarArr.length];
        for (int i = 0; i < cmiVarArr.length; i++) {
            cmiVarArr2[i] = new cmi(cmiVarArr[i]);
        }
        return cmiVarArr2;
    }

    public static float[] n(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int iMin = Math.min(i, fArr.length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static /* synthetic */ dtp o(int i, boolean z) {
        int i2 = dug.a;
        return dug.a() <= 3 ? i != 0 ? i != 1 ? i != 2 ? i != 3 ? dtp.b : dtp.e : dtp.d : z ? dtp.e : dtp.c : dtp.b : i != 0 ? i != 1 ? i != 2 ? i != 3 ? dtp.b : dtp.e : dtp.d : dtp.c : dtp.b;
    }

    public static final void p(ccm ccmVar, bik bikVar, long j, long j2, cfp cfpVar, long j3, chc chcVar, long j4, int i, boolean z, int i2, int i3, Map map, uiq uiqVar, cdo cdoVar, ayc aycVar, int i4, int i5) {
        ccm ccmVar2;
        int i6;
        int i7;
        cfp cfpVar2;
        int i8;
        long j5;
        int i9;
        int i10;
        cdo cdoVar2;
        ayc aycVar2;
        int i11 = i4 & 6;
        ayc aycVarC = aycVar.c(1475122251);
        if (i11 == 0) {
            ccmVar2 = ccmVar;
            i6 = (true != aycVarC.B(ccmVar2) ? 2 : 4) | i4;
        } else {
            ccmVar2 = ccmVar;
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= true != aycVarC.B(bikVar) ? 16 : 32;
        }
        if ((i4 & 384) == 0) {
            i6 |= true != aycVarC.A(j) ? 128 : 256;
        }
        if ((i4 & 3072) == 0) {
            i6 |= true != aycVarC.A(j2) ? 1024 : 2048;
        }
        if ((i4 & 24576) == 0) {
            i6 |= true != aycVarC.B(null) ? 8192 : 16384;
        }
        int i12 = i4 & ImageMetadata.EDGE_MODE;
        int i13 = ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        if (i12 == 0) {
            i7 = 196608;
            cfpVar2 = cfpVar;
            i6 |= true != aycVarC.B(cfpVar2) ? 65536 : 131072;
        } else {
            i7 = 196608;
            cfpVar2 = cfpVar;
        }
        if ((i4 & 1572864) == 0) {
            i8 = 1572864;
            i6 |= true != aycVarC.B(null) ? ImageMetadata.LENS_APERTURE : ImageMetadata.SHADING_MODE;
        } else {
            i8 = 1572864;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= true != aycVarC.A(j3) ? 4194304 : 8388608;
        }
        if ((100663296 & i4) == 0) {
            i6 |= true != aycVarC.B(null) ? 33554432 : 67108864;
        }
        if ((805306368 & i4) == 0) {
            i6 |= true != aycVarC.B(chcVar) ? 268435456 : 536870912;
        }
        if ((i5 & 6) == 0) {
            j5 = j4;
            i9 = i5 | (true != aycVarC.A(j5) ? 2 : 4);
        } else {
            j5 = j4;
            i9 = i5;
        }
        int i14 = i6;
        if ((i5 & 48) == 0) {
            i9 |= true != aycVarC.z(i) ? 16 : 32;
        }
        if ((i5 & 384) == 0) {
            i9 |= true != aycVarC.C(z) ? 128 : 256;
        }
        if ((i5 & 3072) == 0) {
            i9 |= true == aycVarC.z(i2) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i10 = i3;
            i9 |= true == aycVarC.z(i10) ? 16384 : 8192;
        } else {
            i10 = i3;
        }
        if ((i5 & i7) == 0) {
            if (true == aycVarC.D(map)) {
                i13 = 131072;
            }
            i9 |= i13;
        }
        if ((i5 & i8) == 0) {
            i9 |= true != aycVarC.D(uiqVar) ? ImageMetadata.LENS_APERTURE : ImageMetadata.SHADING_MODE;
        }
        if ((i5 & 12582912) == 0) {
            cdoVar2 = cdoVar;
            i9 |= true != aycVarC.B(cdoVar2) ? 4194304 : 8388608;
        } else {
            cdoVar2 = cdoVar;
        }
        if (aycVarC.H(((i14 & 306783379) == 306783378 && (4793491 & i9) == 4793490) ? false : true, i14 & 1)) {
            cdo cdoVarX = cdo.x(cdoVar2, j, j2, cfpVar2, null, j3, chcVar != null ? chcVar.a : Integer.MIN_VALUE, j5, 16609104);
            int i15 = i9 << 9;
            aycVar2 = aycVarC;
            bay.ab(ccmVar2, bikVar, cdoVarX, uiqVar, i, z, i2, i10, map, aycVar2, ((i9 >> 9) & 7168) | (i14 & 126) | (57344 & i15) | (458752 & i15) | (3670016 & i15) | (29360128 & i15) | (i15 & 234881024), 0);
        } else {
            aycVar2 = aycVarC;
            aycVar2.r();
        }
        bai baiVarI = aycVar2.I();
        if (baiVarI != null) {
            baiVarI.d = new dsr(ccmVar, bikVar, j, j2, cfpVar, j3, chcVar, j4, i, z, i2, i3, map, uiqVar, cdoVar, i4, i5, 0);
        }
    }

    public static final dsf q(dsf dsfVar, dsf dsfVar2, float f) {
        return new dsf(chp.x(dsfVar.a, dsfVar2.a, f), chp.x(dsfVar.b, dsfVar2.b, f), chp.x(dsfVar.c, dsfVar2.c, f), chp.x(dsfVar.d, dsfVar2.d, f), chp.x(dsfVar.e, dsfVar2.e, f));
    }

    public static final float r(dsb dsbVar, long j) {
        if (a.q(j, 9205357640488583168L)) {
            return 0.0f;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j >> 32));
        float fX = chp.x(dsbVar.d, dsbVar.e, AmbientLifecycleObserverKt.a(dsbVar.b, dsbVar.c, fIntBitsToFloat));
        return Float.intBitsToFloat((int) (j & 4294967295L)) < 1.0f - Float.intBitsToFloat((int) (j >> 32)) ? ukc.l((Float.intBitsToFloat((int) (j & 4294967295L)) / r5) - 1.0f, 0.0f) : ukc.k(1.0f - ((1.0f - Float.intBitsToFloat((int) (j >> 32))) / ukc.l(fX, (fIntBitsToFloat + 1.0f) / 2.0f)), 0.0f);
    }

    public static final dse s(dsb dsbVar, long j) {
        float fR = r(dsbVar, j);
        dsf dsfVar = dsbVar.i;
        ack ackVar = dsbVar.f;
        return new dse(dsg.a(fR, dsbVar.g, ackVar), dsg.a(fR, dsbVar.h, ackVar), dsg.a(fR, dsfVar, ackVar));
    }

    public static final uif t(bbo bboVar) {
        return (uif) bboVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void u(defpackage.bik r24, defpackage.djq r25, float r26, long r27, defpackage.ejs r29, defpackage.alv r30, defpackage.uiu r31, defpackage.ayc r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 803
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chx.u(bik, djq, float, long, ejs, alv, uiu, ayc, int, int):void");
    }

    public static /* synthetic */ void v(ebn ebnVar, String str) {
        djq djqVarA = AmbientModeSupport.AmbientCallback.a(djq.b, new djs(new axa(19), 2));
        arv arvVar = new arv(6);
        Object obj = ebnVar.b;
        ebnVar.g(new dju(str, a.p(0, 0) || a.p(0, 2), arvVar), djqVarA);
    }

    private static void w(ArrayList arrayList, char c, float[] fArr) {
        arrayList.add(new cmi(c, fArr));
    }
}
