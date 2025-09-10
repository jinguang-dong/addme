package defpackage;

import android.util.Log;
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import com.google.android.apps.camera.modeldownloader.uD.uCzt;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pqw {
    public static final /* synthetic */ int a = 0;

    static {
        try {
            edy.a.c("http://ns.google.com/photos/1.0/panorama/", "GPano");
        } catch (edv e) {
            Log.e("XmpUtil", "Could not register pano namespace!");
            e.printStackTrace();
        }
    }

    public static int a(List list, byte[] bArr) {
        int length = bArr.length;
        if (length > 65502) {
            Log.e("XmpUtil", "The standard XMP section cannot have a size larger than 65502 bytes.");
            return -1;
        }
        byte[] bArr2 = new byte[length + 29];
        int i = 0;
        r(bArr, 0, bArr2, r("http://ns.adobe.com/xap/1.0/\u0000".getBytes(StandardCharsets.UTF_8), 0, bArr2, 0));
        pqu pquVarT = t(bArr2);
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (((pqu) list.get(i2)).d == 225 && j((pqu) list.get(i2), "http://ns.adobe.com/xap/1.0/\u0000")) {
                list.set(i2, pquVarT);
                return i2;
            }
        }
        if (!list.isEmpty() && ((pqu) list.get(0)).d == 225) {
            i = 1;
        }
        list.add(i, pquVarT);
        return i;
    }

    public static edw b(edw edwVar, edw edwVar2) {
        if (edwVar == null) {
            return edwVar2;
        }
        if (edwVar2 != null) {
            try {
                eei eeiVarF = edwVar2.f();
                while (true) {
                    Object next = eeiVarF.next();
                    next.getClass();
                    eef eefVar = (eef) next;
                    String str = eefVar.b;
                    if (str != null) {
                        edwVar.d(eefVar.a, str, eefVar.c, eefVar.a());
                    }
                }
            } catch (Exception unused) {
            }
        }
        return edwVar;
    }

    public static rwc c(String str) {
        if (rnt.V(str)) {
            return rvk.a;
        }
        try {
            gga ggaVar = edy.a;
            return rwc.j(eel.a(str));
        } catch (edv unused) {
            Log.e("XmpUtil", "String was not a serialized XMPMeta.");
            return rvk.a;
        }
    }

    public static rwd d(byte[] bArr, edw edwVar) {
        Object eekVar;
        Object obj;
        Object obj2;
        rwd rwdVarU = u(new pqs(bArr));
        if (rwdVarU == null || (obj2 = rwdVarU.a) == null) {
            gga ggaVar = edy.a;
            eekVar = new eek();
        } else {
            eekVar = (edw) obj2;
        }
        edw edwVar2 = null;
        if (rwdVarU != null && (obj = rwdVarU.b) != null) {
            edwVar2 = (edw) obj;
        }
        return new rwd(eekVar, b(edwVar2, edwVar));
    }

    public static rwd e(InputStream inputStream) {
        return u(new pqt(inputStream));
    }

    public static String f(edw edwVar) throws NumberFormatException {
        try {
            AmbientLifecycleObserverKt.B("http://ns.google.com/photos/1.0/camera/");
            AmbientLifecycleObserverKt.y("SpecialTypeID");
            eez eezVarA = ((eek) edwVar).a("http://ns.google.com/photos/1.0/camera/", AmbientLifecycleObserverKt.F("SpecialTypeID", 1));
            if (eezVarA != null) {
                return (String) ((eej) eezVarA).a;
            }
        } catch (edv unused) {
        }
        return null;
    }

    public static ByteBuffer g(edw edwVar) {
        return ByteBuffer.wrap(w(edwVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r7 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r0.add(r6.d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List h(defpackage.pqv r6, boolean r7, boolean r8) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r6.a()     // Catch: java.io.IOException -> L63
            r2 = 255(0xff, float:3.57E-43)
            if (r1 != r2) goto L63
            int r1 = r6.a()     // Catch: java.io.IOException -> L63
            r3 = 216(0xd8, float:3.03E-43)
            if (r1 != r3) goto L63
        L15:
            int r1 = r6.a()     // Catch: java.io.IOException -> L63
            r3 = -1
            if (r1 == r3) goto L63
            if (r1 != r2) goto L63
        L1e:
            int r1 = r6.a()     // Catch: java.io.IOException -> L63
            if (r1 == r2) goto L1e
            if (r1 != r3) goto L27
            goto L63
        L27:
            r4 = 218(0xda, float:3.05E-43)
            if (r1 != r4) goto L35
            if (r7 != 0) goto L63
            pqu r6 = r6.d()     // Catch: java.io.IOException -> L63
            r0.add(r6)     // Catch: java.io.IOException -> L63
            return r0
        L35:
            int r4 = r6.a()     // Catch: java.io.IOException -> L63
            int r5 = r6.a()     // Catch: java.io.IOException -> L63
            if (r4 == r3) goto L63
            if (r5 == r3) goto L63
            int r3 = r4 << 8
            r3 = r3 | r5
            int r3 = r3 + (-2)
            if (r7 == 0) goto L51
            r4 = 225(0xe1, float:3.15E-43)
            if (r1 != r4) goto L4d
            goto L51
        L4d:
            r6.c(r3)     // Catch: java.io.IOException -> L63
            goto L15
        L51:
            pqu r1 = r6.b(r3, r1)     // Catch: java.io.IOException -> L63
            java.lang.String r3 = "http://ns.adobe.com/xmp/extension/\u0000"
            boolean r3 = j(r1, r3)     // Catch: java.io.IOException -> L63
            if (r3 == 0) goto L5f
            if (r8 != 0) goto L15
        L5f:
            r0.add(r1)     // Catch: java.io.IOException -> L63
            goto L15
        L63:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqw.h(pqv, boolean, boolean):java.util.List");
    }

    public static void i(OutputStream outputStream, List list) throws IOException {
        outputStream.write(255);
        outputStream.write(216);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pqu pquVar = (pqu) it.next();
            outputStream.write(255);
            int i = pquVar.d;
            outputStream.write(i);
            if (i != 218) {
                int iA = pquVar.a() >> 8;
                int iA2 = pquVar.a() & 255;
                outputStream.write(iA);
                outputStream.write(iA2);
            }
            outputStream.write(pquVar.a, pquVar.b, pquVar.c);
        }
    }

    public static boolean j(pqu pquVar, String str) {
        if (pquVar != null) {
            if (pquVar.c >= str.length()) {
                try {
                    byte[] bArr = new byte[str.length()];
                    System.arraycopy(pquVar.a, pquVar.b, bArr, 0, str.length());
                    if (new String(bArr, "UTF-8").equals(str)) {
                        return true;
                    }
                } catch (UnsupportedEncodingException unused) {
                }
            }
        }
        return false;
    }

    public static boolean k(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        return lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".rgbz");
    }

    public static byte[] l(edw edwVar) {
        try {
            return w(edwVar);
        } catch (edv unused) {
            return null;
        }
    }

    public static edw m(byte[] bArr) {
        edw edwVarY = y(new pqs(bArr));
        if (edwVarY != null) {
            return edwVarY;
        }
        gga ggaVar = edy.a;
        return new eek();
    }

    public static edw n(InputStream inputStream) {
        return y(new pqt(inputStream));
    }

    public static void o(byte[] bArr, OutputStream outputStream, edw edwVar, edw edwVar2) {
        q(new pqs(bArr), outputStream, edwVar, edwVar2);
    }

    public static void q(pqv pqvVar, OutputStream outputStream, edw edwVar, edw edwVar2) throws IOException {
        byte[] bArrL;
        if (edwVar == null) {
            return;
        }
        if (edwVar2 != null) {
            bArrL = l(edwVar2);
            if (bArrL == null) {
                return;
            }
            try {
                edwVar.c("http://ns.adobe.com/xmp/note/", "HasExtendedXMP", v(bArrL));
            } catch (edv | IOException unused) {
                return;
            }
        } else {
            bArrL = null;
        }
        byte[] bArrL2 = l(edwVar);
        if (bArrL2 != null) {
            if (edwVar2 != null) {
                edwVar.i();
            }
            int i = 0;
            List listH = h(pqvVar, false, false);
            int iA = a(listH, bArrL2);
            if (iA >= 0) {
                if (bArrL != null) {
                    int i2 = iA + 1;
                    ujp.aW(listH, new pqr(i));
                    String strValueOf = String.valueOf(v(bArrL));
                    ArrayList arrayList = new ArrayList();
                    int length = bArrL.length;
                    String strConcat = "http://ns.adobe.com/xmp/extension/\u0000".concat(strValueOf);
                    int length2 = strConcat.length() + 8;
                    int i3 = (length / (65458 - length2)) + 1;
                    int iR = 0;
                    for (int i4 = 0; i4 < i3; i4++) {
                        int length3 = bArrL.length;
                        byte[] bArr = new byte[Math.min((length3 - iR) + length2, 65458)];
                        int iR2 = r(strConcat.getBytes(StandardCharsets.UTF_8), 0, bArr, 0);
                        int iR3 = iR2 + r(x(length3), 0, bArr, iR2);
                        iR += r(bArrL, iR, bArr, iR3 + r(x(iR), 0, bArr, iR3));
                        arrayList.add(t(bArr));
                    }
                    listH.addAll(i2, arrayList);
                }
                i(outputStream, listH);
            }
        }
    }

    private static int r(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iMin = Math.min(bArr.length - i, bArr2.length - i2);
        System.arraycopy(bArr, i, bArr2, i2, iMin);
        return iMin;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r4[r3] != 62) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r4[r3 - 1] == 63) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r7 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        r7 = r7 - 29;
        r2 = new byte[r7];
        java.lang.System.arraycopy(r0.a, r0.b + 29, r2, 0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        r7 = defpackage.edy.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        return defpackage.eel.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        r7 = r0.c;
        r2 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r2 <= 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r3 = r0.b + r2;
        r4 = r0.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static defpackage.edw s(java.util.List r7) {
        /*
            java.util.Iterator r7 = r7.iterator()
        L4:
            boolean r0 = r7.hasNext()
            r1 = 0
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r7.next()
            pqu r0 = (defpackage.pqu) r0
            java.lang.String r2 = "http://ns.adobe.com/xap/1.0/\u0000"
            boolean r2 = j(r0, r2)
            if (r2 == 0) goto L4
            int r7 = r0.c
            int r2 = r7 + (-1)
        L1d:
            if (r2 <= 0) goto L38
            int r3 = r0.b
            int r3 = r3 + r2
            byte[] r4 = r0.a
            r5 = r4[r3]
            r6 = 62
            if (r5 != r6) goto L35
            int r3 = r3 + (-1)
            r3 = r4[r3]
            r4 = 63
            if (r3 == r4) goto L35
            int r7 = r2 + 1
            goto L38
        L35:
            int r2 = r2 + (-1)
            goto L1d
        L38:
            int r7 = r7 + (-29)
            byte[] r2 = new byte[r7]
            int r3 = r0.b
            int r3 = r3 + 29
            byte[] r0 = r0.a
            r4 = 0
            java.lang.System.arraycopy(r0, r3, r2, r4, r7)
            gga r7 = defpackage.edy.a     // Catch: defpackage.edv -> L4d
            edw r7 = defpackage.eel.a(r2)     // Catch: defpackage.edv -> L4d
            return r7
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqw.s(java.util.List):edw");
    }

    private static pqu t(byte[] bArr) {
        return new pqu(bArr, 225, 0, bArr.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static defpackage.rwd u(defpackage.pqv r12) {
        /*
            r0 = 1
            r1 = 0
            java.util.List r12 = h(r12, r0, r1)
            edw r0 = s(r12)
            r2 = 0
            if (r0 != 0) goto Lf
            goto Lbb
        Lf:
            java.lang.String r3 = "http://ns.adobe.com/xmp/note/"
            java.lang.String r4 = "HasExtendedXMP"
            boolean r5 = r0.e(r3, r4)
            if (r5 != 0) goto L1f
            rwd r12 = new rwd
            r12.<init>(r0, r2)
            return r12
        L1f:
            eez r3 = r0.a(r3, r4)     // Catch: defpackage.edv -> Lbc
            eej r3 = (defpackage.eej) r3     // Catch: defpackage.edv -> Lbc
            java.lang.Object r3 = r3.a     // Catch: defpackage.edv -> Lbc
            java.lang.String r3 = (java.lang.String) r3     // Catch: defpackage.edv -> Lbc
            java.lang.String r4 = "http://ns.adobe.com/xmp/extension/\u0000"
            java.lang.String r5 = "\u0000"
            java.lang.String r3 = defpackage.a.bw(r3, r4, r5)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r12 = r12.iterator()
            r7 = r1
        L45:
            boolean r8 = r12.hasNext()
            if (r8 == 0) goto L7c
            java.lang.Object r8 = r12.next()
            pqu r8 = (defpackage.pqu) r8
            boolean r9 = j(r8, r3)
            if (r9 == 0) goto L45
            int r9 = r8.b
            int r10 = r3.length()
            int r10 = r10 + r9
            int r11 = r8.c
            int r9 = r9 + r11
            int r10 = r10 + 7
            int r11 = r9 - r10
            int r11 = java.lang.Math.max(r1, r11)
            int r7 = r7 + r11
            r4.add(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r5.add(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            r6.add(r8)
            goto L45
        L7c:
            if (r7 != 0) goto L80
        L7e:
            r12 = r2
            goto Lb3
        L80:
            byte[] r12 = new byte[r7]
            r3 = r1
        L83:
            int r7 = r4.size()
            if (r1 >= r7) goto Lad
            java.lang.Object r7 = r4.get(r1)
            pqu r7 = (defpackage.pqu) r7
            java.lang.Object r8 = r5.get(r1)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Object r9 = r6.get(r1)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            int r9 = r9 - r8
            byte[] r7 = r7.a
            java.lang.System.arraycopy(r7, r8, r12, r3, r9)
            int r3 = r3 + r9
            int r1 = r1 + 1
            goto L83
        Lad:
            gga r1 = defpackage.edy.a     // Catch: defpackage.edv -> L7e
            edw r12 = defpackage.eel.a(r12)     // Catch: defpackage.edv -> L7e
        Lb3:
            if (r12 == 0) goto Lbb
            rwd r1 = new rwd
            r1.<init>(r0, r12)
            return r1
        Lbb:
            return r2
        Lbc:
            r12 = move-exception
            r12.printStackTrace()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqw.u(pqv):rwd");
    }

    private static String v(byte[] bArr) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            int length = bArrDigest.length;
            StringBuilder sb = new StringBuilder(length + length);
            Formatter formatter = new Formatter(sb);
            int i = 0;
            for (byte b : bArrDigest) {
                formatter.format("%02x", Byte.valueOf(b));
            }
            formatter.close();
            String string = sb.toString();
            int length2 = string.length();
            while (i < length2) {
                if (rup.f(string.charAt(i))) {
                    char[] charArray = string.toCharArray();
                    while (i < length2) {
                        char c = charArray[i];
                        if (rup.f(c)) {
                            charArray[i] = (char) (c ^ ' ');
                        }
                        i++;
                    }
                    return String.valueOf(charArray);
                }
                i++;
            }
            return string;
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4 A[Catch: IOException -> 0x02d4, TryCatch #0 {IOException -> 0x02d4, blocks: (B:8:0x0032, B:12:0x005a, B:14:0x0062, B:16:0x006d, B:44:0x00ce, B:46:0x00d4, B:47:0x00df, B:50:0x0114, B:51:0x013b, B:53:0x0141, B:54:0x0153, B:55:0x015b, B:57:0x0161, B:59:0x0171, B:60:0x017b, B:62:0x0181, B:63:0x0190, B:77:0x0240, B:79:0x025f, B:83:0x0270, B:84:0x0285, B:86:0x0292, B:88:0x0298, B:89:0x029a, B:90:0x02a3, B:91:0x02a4, B:93:0x02ad, B:94:0x02ae, B:96:0x02b4, B:97:0x02bc, B:99:0x02c6, B:98:0x02c3, B:64:0x019d, B:65:0x01a7, B:67:0x01b2, B:68:0x01b6, B:70:0x01bc, B:71:0x01f5, B:73:0x01fb, B:74:0x0213, B:76:0x0224, B:19:0x0076, B:20:0x007d, B:21:0x007e, B:22:0x0085, B:23:0x0086, B:25:0x008c, B:28:0x0099, B:29:0x00a0, B:30:0x00a1, B:32:0x00a7, B:35:0x00ae, B:36:0x00b5, B:38:0x00b8, B:39:0x00ba, B:41:0x00c0, B:43:0x00ca), top: B:106:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0114 A[Catch: IOException -> 0x02d4, TRY_ENTER, TryCatch #0 {IOException -> 0x02d4, blocks: (B:8:0x0032, B:12:0x005a, B:14:0x0062, B:16:0x006d, B:44:0x00ce, B:46:0x00d4, B:47:0x00df, B:50:0x0114, B:51:0x013b, B:53:0x0141, B:54:0x0153, B:55:0x015b, B:57:0x0161, B:59:0x0171, B:60:0x017b, B:62:0x0181, B:63:0x0190, B:77:0x0240, B:79:0x025f, B:83:0x0270, B:84:0x0285, B:86:0x0292, B:88:0x0298, B:89:0x029a, B:90:0x02a3, B:91:0x02a4, B:93:0x02ad, B:94:0x02ae, B:96:0x02b4, B:97:0x02bc, B:99:0x02c6, B:98:0x02c3, B:64:0x019d, B:65:0x01a7, B:67:0x01b2, B:68:0x01b6, B:70:0x01bc, B:71:0x01f5, B:73:0x01fb, B:74:0x0213, B:76:0x0224, B:19:0x0076, B:20:0x007d, B:21:0x007e, B:22:0x0085, B:23:0x0086, B:25:0x008c, B:28:0x0099, B:29:0x00a0, B:30:0x00a1, B:32:0x00a7, B:35:0x00ae, B:36:0x00b5, B:38:0x00b8, B:39:0x00ba, B:41:0x00c0, B:43:0x00ca), top: B:106:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a7 A[Catch: IOException -> 0x02d4, TryCatch #0 {IOException -> 0x02d4, blocks: (B:8:0x0032, B:12:0x005a, B:14:0x0062, B:16:0x006d, B:44:0x00ce, B:46:0x00d4, B:47:0x00df, B:50:0x0114, B:51:0x013b, B:53:0x0141, B:54:0x0153, B:55:0x015b, B:57:0x0161, B:59:0x0171, B:60:0x017b, B:62:0x0181, B:63:0x0190, B:77:0x0240, B:79:0x025f, B:83:0x0270, B:84:0x0285, B:86:0x0292, B:88:0x0298, B:89:0x029a, B:90:0x02a3, B:91:0x02a4, B:93:0x02ad, B:94:0x02ae, B:96:0x02b4, B:97:0x02bc, B:99:0x02c6, B:98:0x02c3, B:64:0x019d, B:65:0x01a7, B:67:0x01b2, B:68:0x01b6, B:70:0x01bc, B:71:0x01f5, B:73:0x01fb, B:74:0x0213, B:76:0x0224, B:19:0x0076, B:20:0x007d, B:21:0x007e, B:22:0x0085, B:23:0x0086, B:25:0x008c, B:28:0x0099, B:29:0x00a0, B:30:0x00a1, B:32:0x00a7, B:35:0x00ae, B:36:0x00b5, B:38:0x00b8, B:39:0x00ba, B:41:0x00c0, B:43:0x00ca), top: B:106:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x025f A[Catch: IOException -> 0x02d4, TryCatch #0 {IOException -> 0x02d4, blocks: (B:8:0x0032, B:12:0x005a, B:14:0x0062, B:16:0x006d, B:44:0x00ce, B:46:0x00d4, B:47:0x00df, B:50:0x0114, B:51:0x013b, B:53:0x0141, B:54:0x0153, B:55:0x015b, B:57:0x0161, B:59:0x0171, B:60:0x017b, B:62:0x0181, B:63:0x0190, B:77:0x0240, B:79:0x025f, B:83:0x0270, B:84:0x0285, B:86:0x0292, B:88:0x0298, B:89:0x029a, B:90:0x02a3, B:91:0x02a4, B:93:0x02ad, B:94:0x02ae, B:96:0x02b4, B:97:0x02bc, B:99:0x02c6, B:98:0x02c3, B:64:0x019d, B:65:0x01a7, B:67:0x01b2, B:68:0x01b6, B:70:0x01bc, B:71:0x01f5, B:73:0x01fb, B:74:0x0213, B:76:0x0224, B:19:0x0076, B:20:0x007d, B:21:0x007e, B:22:0x0085, B:23:0x0086, B:25:0x008c, B:28:0x0099, B:29:0x00a0, B:30:0x00a1, B:32:0x00a7, B:35:0x00ae, B:36:0x00b5, B:38:0x00b8, B:39:0x00ba, B:41:0x00c0, B:43:0x00ca), top: B:106:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0292 A[Catch: IOException -> 0x02d4, TryCatch #0 {IOException -> 0x02d4, blocks: (B:8:0x0032, B:12:0x005a, B:14:0x0062, B:16:0x006d, B:44:0x00ce, B:46:0x00d4, B:47:0x00df, B:50:0x0114, B:51:0x013b, B:53:0x0141, B:54:0x0153, B:55:0x015b, B:57:0x0161, B:59:0x0171, B:60:0x017b, B:62:0x0181, B:63:0x0190, B:77:0x0240, B:79:0x025f, B:83:0x0270, B:84:0x0285, B:86:0x0292, B:88:0x0298, B:89:0x029a, B:90:0x02a3, B:91:0x02a4, B:93:0x02ad, B:94:0x02ae, B:96:0x02b4, B:97:0x02bc, B:99:0x02c6, B:98:0x02c3, B:64:0x019d, B:65:0x01a7, B:67:0x01b2, B:68:0x01b6, B:70:0x01bc, B:71:0x01f5, B:73:0x01fb, B:74:0x0213, B:76:0x0224, B:19:0x0076, B:20:0x007d, B:21:0x007e, B:22:0x0085, B:23:0x0086, B:25:0x008c, B:28:0x0099, B:29:0x00a0, B:30:0x00a1, B:32:0x00a7, B:35:0x00ae, B:36:0x00b5, B:38:0x00b8, B:39:0x00ba, B:41:0x00c0, B:43:0x00ca), top: B:106:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ad A[Catch: IOException -> 0x02d4, TryCatch #0 {IOException -> 0x02d4, blocks: (B:8:0x0032, B:12:0x005a, B:14:0x0062, B:16:0x006d, B:44:0x00ce, B:46:0x00d4, B:47:0x00df, B:50:0x0114, B:51:0x013b, B:53:0x0141, B:54:0x0153, B:55:0x015b, B:57:0x0161, B:59:0x0171, B:60:0x017b, B:62:0x0181, B:63:0x0190, B:77:0x0240, B:79:0x025f, B:83:0x0270, B:84:0x0285, B:86:0x0292, B:88:0x0298, B:89:0x029a, B:90:0x02a3, B:91:0x02a4, B:93:0x02ad, B:94:0x02ae, B:96:0x02b4, B:97:0x02bc, B:99:0x02c6, B:98:0x02c3, B:64:0x019d, B:65:0x01a7, B:67:0x01b2, B:68:0x01b6, B:70:0x01bc, B:71:0x01f5, B:73:0x01fb, B:74:0x0213, B:76:0x0224, B:19:0x0076, B:20:0x007d, B:21:0x007e, B:22:0x0085, B:23:0x0086, B:25:0x008c, B:28:0x0099, B:29:0x00a0, B:30:0x00a1, B:32:0x00a7, B:35:0x00ae, B:36:0x00b5, B:38:0x00b8, B:39:0x00ba, B:41:0x00c0, B:43:0x00ca), top: B:106:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c3 A[Catch: IOException -> 0x02d4, TryCatch #0 {IOException -> 0x02d4, blocks: (B:8:0x0032, B:12:0x005a, B:14:0x0062, B:16:0x006d, B:44:0x00ce, B:46:0x00d4, B:47:0x00df, B:50:0x0114, B:51:0x013b, B:53:0x0141, B:54:0x0153, B:55:0x015b, B:57:0x0161, B:59:0x0171, B:60:0x017b, B:62:0x0181, B:63:0x0190, B:77:0x0240, B:79:0x025f, B:83:0x0270, B:84:0x0285, B:86:0x0292, B:88:0x0298, B:89:0x029a, B:90:0x02a3, B:91:0x02a4, B:93:0x02ad, B:94:0x02ae, B:96:0x02b4, B:97:0x02bc, B:99:0x02c6, B:98:0x02c3, B:64:0x019d, B:65:0x01a7, B:67:0x01b2, B:68:0x01b6, B:70:0x01bc, B:71:0x01f5, B:73:0x01fb, B:74:0x0213, B:76:0x0224, B:19:0x0076, B:20:0x007d, B:21:0x007e, B:22:0x0085, B:23:0x0086, B:25:0x008c, B:28:0x0099, B:29:0x00a0, B:30:0x00a1, B:32:0x00a7, B:35:0x00ae, B:36:0x00b5, B:38:0x00b8, B:39:0x00ba, B:41:0x00c0, B:43:0x00ca), top: B:106:0x0032 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] w(defpackage.edw r20) throws defpackage.edv, java.io.IOException {
        /*
            Method dump skipped, instructions count: 741
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqw.w(edw):byte[]");
    }

    private static byte[] x(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    private static edw y(pqv pqvVar) {
        edw edwVarS = s(h(pqvVar, true, true));
        if (edwVarS == null || !edwVarS.e("http://ns.adobe.com/xmp/note/", "HasExtendedXMP")) {
            return edwVarS;
        }
        try {
            return edwVarS;
        } catch (edv e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void p(edw edwVar, String str) {
        try {
            edy.a.c("http://ns.google.com/photos/1.0/camera/", "GCamera");
            edwVar.g("SpecialTypeID", new eex(512), str, new eex());
        } catch (edv e) {
            Log.e("XmpUtil", uCzt.cvj.concat(String.valueOf(e.getMessage())));
        }
    }
}
