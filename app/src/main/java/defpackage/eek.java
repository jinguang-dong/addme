package defpackage;

import androidx.wear.ambient.AmbientLifecycleObserverKt;
import androidx.wear.ambient.AmbientMode;
import java.util.GregorianCalendar;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eek implements edw {
    public final een a;

    public eek() {
        this.a = new een(null, null, null);
    }

    static final void n(een eenVar, Object obj, eex eexVar) throws edv {
        String string;
        int length;
        eenVar.g().b(eexVar);
        if (eenVar.g().l()) {
            if (obj != null && obj.toString().length() > 0) {
                throw new edv("Composite nodes can't have values", 102);
            }
            eenVar.q();
            return;
        }
        String string2 = null;
        if (obj == null) {
            string = null;
        } else if (obj instanceof Boolean) {
            string = true != ((Boolean) obj).booleanValue() ? "False" : "True";
        } else if (obj instanceof Integer) {
            string = String.valueOf(((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            string = String.valueOf(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            string = String.valueOf(((Double) obj).doubleValue());
        } else if (obj instanceof eee) {
            string = AmbientLifecycleObserverKt.D((eee) obj);
        } else if (obj instanceof GregorianCalendar) {
            int i = edu.a;
            string = AmbientLifecycleObserverKt.D(new eee((GregorianCalendar) obj));
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length2 = bArr.length;
            byte[] bArr2 = edz.a;
            byte[] bArr3 = new byte[((length2 + 2) / 3) * 4];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = i2 + 3;
                length = bArr.length;
                if (i4 > length) {
                    break;
                }
                int i5 = i3 + 3;
                int i6 = (bArr[i2] & 255) << 16;
                int i7 = i2 + 2;
                int i8 = (bArr[i2 + 1] & 255) << 8;
                i2 += 3;
                int i9 = i8 | i6 | (bArr[i7] & 255);
                byte[] bArr4 = edz.a;
                bArr3[i3] = bArr4[i9 >> 18];
                bArr3[i3 + 1] = bArr4[(i9 >> 12) & 63];
                bArr3[i3 + 2] = bArr4[(i9 & 4032) >> 6];
                i3 += 4;
                bArr3[i5] = bArr4[i9 & 63];
            }
            int i10 = length - i2;
            if (i10 == 2) {
                int i11 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
                byte[] bArr5 = edz.a;
                bArr3[i3] = bArr5[i11 >> 18];
                bArr3[i3 + 1] = bArr5[(i11 >> 12) & 63];
                bArr3[i3 + 2] = bArr5[(i11 & 4032) >> 6];
                bArr3[i3 + 3] = 61;
            } else if (i10 == 1) {
                int i12 = (bArr[i2] & 255) << 16;
                byte[] bArr6 = edz.a;
                bArr3[i3] = bArr6[i12 >> 18];
                bArr3[i3 + 1] = bArr6[(i12 >> 12) & 63];
                bArr3[i3 + 2] = 61;
                bArr3[i3 + 3] = 61;
            }
            string = new String(bArr3);
        } else {
            string = obj.toString();
        }
        if (string != null) {
            int i13 = eed.a;
            StringBuffer stringBuffer = new StringBuffer(string);
            for (int i14 = 0; i14 < stringBuffer.length(); i14++) {
                if (eed.b(stringBuffer.charAt(i14))) {
                    stringBuffer.setCharAt(i14, ' ');
                }
            }
            string2 = stringBuffer.toString();
        }
        if (eenVar.g().m() && "xml:lang".equals(eenVar.a)) {
            eenVar.b = eed.a(string2);
        } else {
            eenVar.b = string2;
        }
    }

    public static final void o(een eenVar, int i, String str, eex eexVar, boolean z) {
        een eenVar2 = new een("[]", null);
        eex eexVarS = AmbientLifecycleObserverKt.s(eexVar, str);
        int iA = z ? eenVar.a() + 1 : eenVar.a();
        if (i == -1) {
            i = iA;
        }
        if (i <= 0 || i > iA) {
            throw new edv("Array index out of bounds", 104);
        }
        if (!z) {
            eenVar.o(i);
        }
        eenVar.l(i, eenVar2);
        n(eenVar2, str, eexVarS);
    }

    @Override // defpackage.edw
    public final eez a(String str, String str2) throws edv, NumberFormatException {
        AmbientLifecycleObserverKt.B(str);
        AmbientLifecycleObserverKt.A(str2);
        een eenVarP = AmbientLifecycleObserverKt.p(this.a, AmbientMode.AmbientCallback.v(str, str2), false, null);
        if (eenVarP != null) {
            return new eej(p(0, eenVarP));
        }
        return null;
    }

    @Override // defpackage.edw
    public final Integer b(String str, String str2) {
        return (Integer) m(str, str2, 2);
    }

    @Override // defpackage.edw
    public final void c(String str, String str2, Object obj) {
        d(str, str2, obj, null);
    }

    public final Object clone() {
        return new eek((een) this.a.clone());
    }

    @Override // defpackage.edw
    public final void d(String str, String str2, Object obj, eex eexVar) {
        AmbientLifecycleObserverKt.B(str);
        AmbientLifecycleObserverKt.A(str2);
        eex eexVarS = AmbientLifecycleObserverKt.s(eexVar, obj);
        een eenVarP = AmbientLifecycleObserverKt.p(this.a, AmbientMode.AmbientCallback.v(str, str2), true, eexVarS);
        if (eenVarP == null) {
            throw new edv("Specified property does not exist", 102);
        }
        n(eenVarP, obj, eexVarS);
    }

    @Override // defpackage.edw
    public final boolean e(String str, String str2) {
        try {
            AmbientLifecycleObserverKt.B(str);
            AmbientLifecycleObserverKt.A(str2);
        } catch (edv unused) {
        }
        return AmbientLifecycleObserverKt.p(this.a, AmbientMode.AmbientCallback.v(str, str2), false, null) != null;
    }

    @Override // defpackage.edw
    public final eei f() {
        return new eei(this);
    }

    @Override // defpackage.edw
    public final void g(String str, eex eexVar, String str2, eex eexVar2) throws edv, NumberFormatException {
        AmbientLifecycleObserverKt.B("http://ns.google.com/photos/1.0/camera/");
        AmbientLifecycleObserverKt.y(str);
        if ((eexVar.a & (-7681)) != 0) {
            throw new edv("Only array form flags allowed for arrayOptions", 103);
        }
        eex eexVarS = AmbientLifecycleObserverKt.s(eexVar, null);
        eer eerVarV = AmbientMode.AmbientCallback.v("http://ns.google.com/photos/1.0/camera/", str);
        een eenVar = this.a;
        een eenVarP = AmbientLifecycleObserverKt.p(eenVar, eerVarV, false, null);
        if (eenVarP != null) {
            if (!eenVarP.g().d()) {
                throw new edv("The named property is not an array", 102);
            }
        } else {
            if (!eexVarS.d()) {
                throw new edv("Explicit arrayOptions required to create new array", 103);
            }
            eenVarP = AmbientLifecycleObserverKt.p(eenVar, eerVarV, true, eexVarS);
            if (eenVarP == null) {
                throw new edv("Failure creating array node", 102);
            }
        }
        o(eenVarP, -1, str2, eexVar2, true);
    }

    @Override // defpackage.edw
    public final int h() throws edv, NumberFormatException {
        AmbientLifecycleObserverKt.B("http://ns.google.com/photos/1.0/container/");
        AmbientLifecycleObserverKt.y("Directory");
        een eenVarP = AmbientLifecycleObserverKt.p(this.a, AmbientMode.AmbientCallback.v("http://ns.google.com/photos/1.0/container/", "Directory"), false, null);
        if (eenVarP == null) {
            return 0;
        }
        if (eenVarP.g().d()) {
            return eenVarP.a();
        }
        throw new edv("The named property is not an array", 102);
    }

    @Override // defpackage.edw
    public final void i() throws NumberFormatException {
        try {
            AmbientLifecycleObserverKt.B("http://ns.adobe.com/xmp/note/");
            AmbientLifecycleObserverKt.A("HasExtendedXMP");
            een eenVarP = AmbientLifecycleObserverKt.p(this.a, AmbientMode.AmbientCallback.v("http://ns.adobe.com/xmp/note/", "HasExtendedXMP"), false, null);
            if (eenVarP != null) {
                AmbientLifecycleObserverKt.u(eenVarP);
            }
        } catch (edv unused) {
        }
    }

    @Override // defpackage.edw
    public final void k(String str, boolean z) {
        d("http://ns.google.com/photos/1.0/panorama/", str, true != z ? "False" : "True", null);
    }

    @Override // defpackage.edw
    public final void l(String str, int i) {
        d("http://ns.google.com/photos/1.0/panorama/", str, Integer.valueOf(i), null);
    }

    public final Object m(String str, String str2, int i) throws edv, NumberFormatException {
        AmbientLifecycleObserverKt.B(str);
        AmbientLifecycleObserverKt.A(str2);
        een eenVarP = AmbientLifecycleObserverKt.p(this.a, AmbientMode.AmbientCallback.v(str, str2), false, null);
        if (eenVarP == null) {
            return null;
        }
        if (i == 0 || !eenVarP.g().l()) {
            return p(i, eenVarP);
        }
        throw new edv("Property must be simple when a value type is requested", 102);
    }

    public eek(een eenVar) {
        this.a = eenVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b A[Catch: all -> 0x00bc, LOOP:2: B:24:0x0057->B:26:0x005b, LOOP_END, TryCatch #3 {all -> 0x00bc, blocks: (B:8:0x001e, B:9:0x0026, B:11:0x0029, B:13:0x0031, B:16:0x003a, B:17:0x003d, B:18:0x0044, B:20:0x0047, B:23:0x0050, B:24:0x0057, B:26:0x005b, B:28:0x0095, B:29:0x00a6, B:31:0x00a9), top: B:103:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095 A[Catch: all -> 0x00bc, TryCatch #3 {all -> 0x00bc, blocks: (B:8:0x001e, B:9:0x0026, B:11:0x0029, B:13:0x0031, B:16:0x003a, B:17:0x003d, B:18:0x0044, B:20:0x0047, B:23:0x0050, B:24:0x0057, B:26:0x005b, B:28:0x0095, B:29:0x00a6, B:31:0x00a9), top: B:103:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9 A[Catch: all -> 0x00bc, TRY_LEAVE, TryCatch #3 {all -> 0x00bc, blocks: (B:8:0x001e, B:9:0x0026, B:11:0x0029, B:13:0x0031, B:16:0x003a, B:17:0x003d, B:18:0x0044, B:20:0x0047, B:23:0x0050, B:24:0x0057, B:26:0x005b, B:28:0x0095, B:29:0x00a6, B:31:0x00a9), top: B:103:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.lang.Object p(int r10, defpackage.een r11) throws defpackage.edv {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eek.p(int, een):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
    
        throw new defpackage.edv("Language qualifier must be first", 102);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0139, code lost:
    
        throw new defpackage.edv("Alt-text array item has no language qualifier", 102);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    @Override // defpackage.edw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(java.lang.String r23) throws defpackage.edv, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eek.j(java.lang.String):void");
    }
}
