package defpackage;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.Binder;
import android.os.LocaleList;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagElement;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.camera.jni.saliency.tLp.KsvNaXS;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes.dex */
public class clc {
    public clc() {
    }

    public static void A(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static int B(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        String strPermissionToOp = AppOpsManager.permissionToOp(str);
        if (strPermissionToOp == null) {
            return 0;
        }
        if (packageName == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            packageName = packagesForUid[0];
        }
        int iMyUid2 = Process.myUid();
        String packageName2 = context.getPackageName();
        if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName)) {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
            iNoteProxyOpNoThrow = cgh.m(appOpsManager, strPermissionToOp, Binder.getCallingUid(), packageName);
            if (iNoteProxyOpNoThrow == 0) {
                iNoteProxyOpNoThrow = cgh.m(appOpsManager, strPermissionToOp, iMyUid, context.getOpPackageName());
            }
        } else {
            iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
        }
        return iNoteProxyOpNoThrow != 0 ? -2 : 0;
    }

    public static float C(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public static int D(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static Font E(FontFamily fontFamily, int i) {
        int i2 = 1;
        FontStyle fontStyle = new FontStyle(1 != (i & 1) ? 400 : 700, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iB = b(fontStyle, font.getStyle());
        while (i2 < fontFamily.getSize()) {
            Font font2 = fontFamily.getFont(i2);
            int iB2 = b(fontStyle, font2.getStyle());
            int i3 = iB2 < iB ? iB2 : iB;
            if (iB2 < iB) {
                font = font2;
            }
            i2++;
            iB = i3;
        }
        return font;
    }

    public static FontFamily F(cnc[] cncVarArr, ContentResolver contentResolver) throws IOException {
        FontFamily.Builder builder = null;
        for (cnc cncVar : cncVarArr) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor((Uri) cncVar.e, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(cncVar.b).setSlant(cncVar.c ? 1 : 0).setTtcIndex(cncVar.a).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    continue;
                }
            } catch (IOException e) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static float G(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !O(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int H(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static int I(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !O(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static int J(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    public static TypedArray K(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static CharSequence L(TypedArray typedArray, int i, int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    public static String M(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    public static boolean N(TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    public static boolean O(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static CharSequence[] P(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    public static int Q(TypedArray typedArray, int i, int i2) {
        return typedArray.getInt(i, typedArray.getInt(i2, Integer.MAX_VALUE));
    }

    public static boolean R(TypedArray typedArray, XmlPullParser xmlPullParser, boolean z) {
        return !O(xmlPullParser, "autoMirrored") ? z : typedArray.getBoolean(5, z);
    }

    public static int S(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (O(xmlPullParser, str)) {
            return typedArray.getColor(i, 0);
        }
        return 0;
    }

    public static ColorStateList T(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!O(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        if (typedValue.type == 2) {
            typedValue.toString();
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: ".concat(typedValue.toString()));
        }
        if (typedValue.type >= 28 && typedValue.type <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        int i = clz.a;
        try {
            return clz.a(resources, resources.getXml(resourceId), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    public static int U(int i) {
        if (i <= 4) {
            return 8;
        }
        return i + i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x017a, code lost:
    
        if (r12.size() <= 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x017c, code lost:
    
        r0 = new defpackage.ebn((java.util.List) r12, (java.util.List) r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0182, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0183, code lost:
    
        if (r0 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0187, code lost:
    
        if (r18 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0189, code lost:
    
        r0 = new defpackage.ebn(r8, r3, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x018f, code lost:
    
        r0 = new defpackage.ebn(r8, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0195, code lost:
    
        if (r13 == 1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0198, code lost:
    
        if (r13 == 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x019a, code lost:
    
        r13 = new android.graphics.LinearGradient(r22, r23, r16, r17, (int[]) r0.b, (float[]) r0.a, defpackage.cgh.l(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b4, code lost:
    
        r13 = new android.graphics.SweepGradient(r10, r5, (int[]) r0.b, (float[]) r0.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01c6, code lost:
    
        if (r21 <= 0.0f) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01c8, code lost:
    
        r13 = new android.graphics.RadialGradient(r10, r5, r21, (int[]) r0.b, (float[]) r0.a, defpackage.cgh.l(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e3, code lost:
    
        r0 = new defpackage.nll(r13, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01f2, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022f A[Catch: Exception -> 0x023f, TRY_LEAVE, TryCatch #0 {Exception -> 0x023f, blocks: (B:12:0x0039, B:13:0x0041, B:17:0x004c, B:18:0x0053, B:19:0x0054, B:34:0x0080, B:36:0x008a, B:37:0x0103, B:39:0x010d, B:56:0x0176, B:58:0x017c, B:68:0x019a, B:73:0x01e3, B:69:0x01b4, B:72:0x01c8, B:74:0x01eb, B:75:0x01f2, B:63:0x0189, B:64:0x018f, B:46:0x011d, B:48:0x0129, B:51:0x013d, B:52:0x0159, B:53:0x016c, B:76:0x01f3, B:77:0x0210, B:78:0x0211, B:79:0x022e, B:80:0x022f), top: B:88:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.nll V(android.content.res.TypedArray r26, org.xmlpull.v1.XmlPullParser r27, android.content.res.Resources.Theme r28, java.lang.String r29, int r30) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 595
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clc.V(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme, java.lang.String, int):nll");
    }

    public static boolean W(cdo cdoVar) {
        return (cdoVar.d != null ? new ccr() : null) == null || !a.p(0, 1);
    }

    public static cgk X() {
        cgi cgiVar = cgl.a;
        chp chpVar = cgiVar.c;
        LocaleList localeList = LocaleList.getDefault();
        synchronized (chpVar) {
            cgk cgkVar = cgiVar.b;
            if (cgkVar != null && localeList == cgiVar.a) {
                return cgkVar;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(new cgj(localeList.get(i)));
            }
            cgk cgkVar2 = new cgk(arrayList);
            cgiVar.a = localeList;
            cgiVar.b = cgkVar2;
            return cgkVar2;
        }
    }

    public static Typeface Y(String str, cfp cfpVar) {
        if (a.p(0, 0) && a.ao(cfpVar, cfp.e) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), cfpVar.h, a.p(0, 1));
    }

    public static Typeface Z(cfr cfrVar, cfp cfpVar) {
        return Y(cfrVar.f, cfpVar);
    }

    private static List a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r0 != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object aa(java.lang.Object r4, defpackage.cfc r5, defpackage.cfp r6) {
        /*
            boolean r0 = r4 instanceof android.graphics.Typeface
            if (r0 != 0) goto L5
            goto L32
        L5:
            cfp r0 = r5.b()
            boolean r0 = defpackage.a.ao(r0, r6)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L25
            cfp r0 = defpackage.cfp.c
            int r3 = r6.compareTo(r0)
            if (r3 < 0) goto L25
            cfp r3 = r5.b()
            int r0 = r3.compareTo(r0)
            if (r0 >= 0) goto L25
            r0 = r1
            goto L26
        L25:
            r0 = r2
        L26:
            r5.c()
            boolean r3 = defpackage.a.p(r2, r2)
            if (r3 == 0) goto L33
            if (r0 == 0) goto L32
            goto L3c
        L32:
            return r4
        L33:
            if (r0 != 0) goto L3c
            cfp r6 = r5.b()
            int r6 = r6.h
            goto L3e
        L3c:
            int r6 = r6.h
        L3e:
            if (r3 != 0) goto L45
            boolean r5 = defpackage.a.p(r2, r1)
            goto L4c
        L45:
            r5.c()
            boolean r5 = defpackage.a.p(r2, r1)
        L4c:
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r4, r6, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clc.aa(java.lang.Object, cfc, cfp):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c A[LOOP:0: B:5:0x000d->B:38:0x006c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f A[EDGE_INSN: B:43:0x006f->B:39:0x006f BREAK  A[LOOP:0: B:5:0x000d->B:38:0x006c], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [bij] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [bij] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [bdp] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [bdp] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.bwx ab(defpackage.bvm r7) {
        /*
            bwe r7 = r7.s
            int r0 = r7.a()
            r0 = r0 & 8
            r1 = 0
            if (r0 == 0) goto L6f
            bij r7 = r7.f
        Ld:
            if (r7 == 0) goto L6f
            int r0 = r7.n
            r0 = r0 & 8
            if (r0 == 0) goto L66
            r0 = r7
            r2 = r1
        L17:
            if (r0 == 0) goto L66
            boolean r3 = r0 instanceof defpackage.bwx
            if (r3 == 0) goto L29
            r3 = r0
            bwx r3 = (defpackage.bwx) r3
            boolean r3 = r3.p()
            if (r3 != 0) goto L27
            goto L61
        L27:
            r1 = r0
            goto L6f
        L29:
            int r3 = r0.n
            r3 = r3 & 8
            if (r3 == 0) goto L61
            boolean r3 = r0 instanceof defpackage.bup
            if (r3 == 0) goto L61
            r3 = r0
            bup r3 = (defpackage.bup) r3
            bij r3 = r3.y
            r4 = 0
        L39:
            r5 = 1
            if (r3 == 0) goto L5f
            int r6 = r3.n
            r6 = r6 & 8
            if (r6 == 0) goto L5c
            int r4 = r4 + 1
            if (r4 != r5) goto L48
            r0 = r3
            goto L5c
        L48:
            if (r2 != 0) goto L53
            bdp r2 = new bdp
            r5 = 16
            bij[] r5 = new defpackage.bij[r5]
            r2.<init>(r5)
        L53:
            if (r0 == 0) goto L58
            r2.n(r0)
        L58:
            r2.n(r3)
            r0 = r1
        L5c:
            bij r3 = r3.q
            goto L39
        L5f:
            if (r4 == r5) goto L17
        L61:
            bij r0 = defpackage.bko.y(r2)
            goto L17
        L66:
            int r0 = r7.o
            r0 = r0 & 8
            if (r0 == 0) goto L6f
            bij r7 = r7.q
            goto Ld
        L6f:
            bwx r1 = (defpackage.bwx) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clc.ab(bvm):bwx");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062 A[LOOP:0: B:5:0x000d->B:35:0x0062, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0065 A[EDGE_INSN: B:43:0x0065->B:36:0x0065 BREAK  A[LOOP:0: B:5:0x000d->B:35:0x0062], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10, types: [bij] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [bij] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [bdp] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [bdp] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.cbr ac(defpackage.bvm r8, boolean r9) {
        /*
            bwe r0 = r8.s
            int r1 = r0.a()
            r1 = r1 & 8
            r2 = 0
            if (r1 == 0) goto L65
            bij r0 = r0.f
        Ld:
            if (r0 == 0) goto L65
            int r1 = r0.n
            r1 = r1 & 8
            if (r1 == 0) goto L5c
            r1 = r0
            r3 = r2
        L17:
            if (r1 == 0) goto L5c
            boolean r4 = r1 instanceof defpackage.bwx
            if (r4 == 0) goto L1f
            r2 = r1
            goto L65
        L1f:
            int r4 = r1.n
            r4 = r4 & 8
            if (r4 == 0) goto L57
            boolean r4 = r1 instanceof defpackage.bup
            if (r4 == 0) goto L57
            r4 = r1
            bup r4 = (defpackage.bup) r4
            bij r4 = r4.y
            r5 = 0
        L2f:
            r6 = 1
            if (r4 == 0) goto L55
            int r7 = r4.n
            r7 = r7 & 8
            if (r7 == 0) goto L52
            int r5 = r5 + 1
            if (r5 != r6) goto L3e
            r1 = r4
            goto L52
        L3e:
            if (r3 != 0) goto L49
            bdp r3 = new bdp
            r6 = 16
            bij[] r6 = new defpackage.bij[r6]
            r3.<init>(r6)
        L49:
            if (r1 == 0) goto L4e
            r3.n(r1)
        L4e:
            r3.n(r4)
            r1 = r2
        L52:
            bij r4 = r4.q
            goto L2f
        L55:
            if (r5 == r6) goto L17
        L57:
            bij r1 = defpackage.bko.y(r3)
            goto L17
        L5c:
            int r1 = r0.o
            r1 = r1 & 8
            if (r1 == 0) goto L65
            bij r0 = r0.q
            goto Ld
        L65:
            r2.getClass()
            bwx r2 = (defpackage.bwx) r2
            bij r0 = r2.B()
            cbn r1 = r8.p()
            if (r1 != 0) goto L79
            cbn r1 = new cbn
            r1.<init>()
        L79:
            cbr r2 = new cbr
            r2.<init>(r0, r9, r8, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clc.ac(bvm, boolean):cbr");
    }

    public static Object ad(cbn cbnVar, cbz cbzVar) {
        Object objA = cbnVar.c.a(cbzVar);
        if (objA == null) {
            return null;
        }
        return objA;
    }

    public static String ae(int i, ayc aycVar) {
        return ((Resources) aycVar.e(AndroidCompositionLocals_androidKt.c)).getString(i);
    }

    public static bik ag(bik bikVar, String str) {
        return bikVar.cM(new TestTagElement(str));
    }

    public static boolean ah(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        int length2 = fArr2.length;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f3 * f8) - (f4 * f7);
        float f18 = (f9 * f14) - (f10 * f13);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f9 * f15) - (f11 * f13);
        float f21 = (f2 * f7) - (f3 * f6);
        float f22 = (f9 * f16) - (f12 * f13);
        float f23 = (f * f8) - (f4 * f5);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f * f7) - (f3 * f5);
        float f26 = (f10 * f16) - (f12 * f14);
        float f27 = (f * f6) - (f2 * f5);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (((((f27 * f28) - (f25 * f26)) + (f23 * f24)) + (f21 * f22)) - (f19 * f20)) + (f17 * f18);
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = (((f6 * f28) - (f7 * f26)) + (f8 * f24)) * f30;
            fArr2[1] = ((((-f2) * f28) + (f3 * f26)) - (f4 * f24)) * f30;
            fArr2[2] = (((f14 * f17) - (f15 * f19)) + (f16 * f21)) * f30;
            fArr2[3] = ((((-f10) * f17) + (f11 * f19)) - (f12 * f21)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f31 * f28) + (f7 * f22)) - (f8 * f20)) * f30;
            fArr2[5] = (((f28 * f) - (f3 * f22)) + (f4 * f20)) * f30;
            float f32 = -f13;
            fArr2[6] = (((f32 * f17) + (f15 * f23)) - (f16 * f25)) * f30;
            fArr2[7] = (((f17 * f9) - (f11 * f23)) + (f12 * f25)) * f30;
            fArr2[8] = (((f5 * f26) - (f6 * f22)) + (f8 * f18)) * f30;
            fArr2[9] = ((((-f) * f26) + (f22 * f2)) - (f4 * f18)) * f30;
            fArr2[10] = (((f13 * f19) - (f14 * f23)) + (f16 * f27)) * f30;
            fArr2[11] = ((((-f9) * f19) + (f23 * f10)) - (f12 * f27)) * f30;
            fArr2[12] = (((f31 * f24) + (f6 * f20)) - (f7 * f18)) * f30;
            fArr2[13] = (((f * f24) - (f2 * f20)) + (f3 * f18)) * f30;
            fArr2[14] = (((f32 * f21) + (f14 * f25)) - (f15 * f27)) * f30;
            fArr2[15] = (((f9 * f21) - (f10 * f25)) + (f11 * f27)) * f30;
        }
        return f29 != 0.0f;
    }

    public static qqq ai(Context context) {
        return new qqq(new pfl(context, (byte[]) null), new ceq(cfq.a.a(context)), cff.b, new cfi(cff.a, 2));
    }

    public static /* synthetic */ cfc aj(ocq ocqVar, cfz cfzVar, cfp cfpVar) {
        return new cga((String) ocqVar.a, cfzVar, cfpVar);
    }

    private static int b(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public static Intent v(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String strX = x(activity);
        if (strX == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, strX);
        try {
            return y(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", a.bw(strX, "getParentActivityIntent: bad parentActivityName '", "' in manifest"));
            return null;
        }
    }

    public static Intent w(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strY = y(context, componentName);
        if (strY == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strY);
        return y(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String x(Activity activity) {
        try {
            return y(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String y(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 269222528);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        if (activityInfo.metaData == null || (string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        return string.charAt(0) == '.' ? String.valueOf(context.getPackageName()).concat(string) : string;
    }

    public static List z(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(a(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public void d(clf clfVar) {
    }

    public void e() {
    }

    public void f(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
    }

    public boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        return false;
    }

    public boolean i(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        return false;
    }

    public boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean k(View view) {
        return false;
    }

    public void l(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    public void m(CoordinatorLayout coordinatorLayout, View view) {
    }

    public boolean n(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return false;
    }

    public boolean o(View view) {
        return false;
    }

    public void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
    }

    public void q(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        iArr[0] = iArr[0] + i2;
        iArr[1] = iArr[1] + i3;
    }

    public void r(View view, Parcelable parcelable) {
    }

    public Parcelable s(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return false;
    }

    public boolean u(View view, Rect rect) {
        return false;
    }

    public clc(Context context, AttributeSet attributeSet) {
    }

    public static bao af(View view) {
        uhf uhfVarL;
        byt bytVar;
        Map map = cal.a;
        uhg uhgVar = uhg.a;
        uhgVar.get(uhc.k);
        ues uesVar = byr.a;
        if (byx.b()) {
            uhfVarL = byi.l();
        } else {
            uhfVarL = (uhf) byr.b.get();
            if (uhfVarL == null) {
                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
            }
        }
        uhf uhfVarPlus = uhfVarL.plus(uhgVar);
        azo azoVar = (azo) uhfVarPlus.get(azo.e);
        if (azoVar != null) {
            byt bytVar2 = new byt(azoVar, 1);
            Object obj = bytVar2.a;
            synchronized (((azj) obj).a) {
                ((azj) obj).d = false;
            }
            bytVar = bytVar2;
        } else {
            bytVar = null;
        }
        uka ukaVar = new uka();
        uhf bztVar = (bim) uhfVarPlus.get(bim.a);
        if (bztVar == null) {
            bztVar = new bzt();
            ukaVar.a = bztVar;
        }
        uhf uhfVarPlus2 = uhfVarPlus.plus(bytVar != null ? bytVar : uhg.a).plus(bztVar);
        bao baoVar = new bao(uhfVarPlus2);
        baoVar.w();
        und undVarJ = ung.j(uhfVarPlus2);
        cwh cwhVarE = col.e(view);
        cwc lifecycle = cwhVarE != null ? cwhVarE.getLifecycle() : null;
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new cag(view, baoVar));
            lifecycle.a(new cai(undVarJ, bytVar, baoVar, ukaVar, view));
            return baoVar;
        }
        String str = KsvNaXS.yUOrSbNDROa;
        java.util.Objects.toString(view);
        bqs.a(str.concat(String.valueOf(view)));
        throw new uer();
    }

    public clc(byte[] bArr) {
        ctq ctqVar = ctq.a;
    }

    public clc(byte[] bArr, byte[] bArr2, byte[] bArr3) {
    }

    public /* synthetic */ clc(char[] cArr) {
    }
}
