package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cme {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static void a(Context context, int i, cmd cmdVar) throws XmlPullParserException, Resources.NotFoundException, IOException {
        if (context.isRestricted()) {
            cmdVar.c(-4);
        } else {
            b(context, i, new TypedValue(), 0, cmdVar, false, false);
        }
    }

    public static Typeface b(Context context, int i, TypedValue typedValue, int i2, cmd cmdVar, boolean z, boolean z2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface typefaceC = c(context, resources, typedValue, i, i2, cmdVar, z, z2);
        if (typefaceC != null || cmdVar != null || z2) {
            return typefaceC;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ab A[Catch: IOException -> 0x02f5, XmlPullParserException -> 0x02f7, TryCatch #6 {IOException -> 0x02f5, XmlPullParserException -> 0x02f7, blocks: (B:30:0x007d, B:34:0x00b9, B:36:0x00c0, B:37:0x00c4, B:39:0x00ca, B:41:0x00d4, B:86:0x01ab, B:88:0x01b2, B:90:0x01b7, B:92:0x01bd, B:94:0x01c3, B:106:0x01e8, B:109:0x01ee, B:116:0x01fa, B:118:0x01fe, B:120:0x020c, B:122:0x0221, B:144:0x02a5, B:121:0x0217, B:97:0x01cd, B:99:0x01da, B:123:0x022c, B:141:0x029b, B:142:0x029f, B:137:0x0292, B:42:0x00e5, B:43:0x00ea, B:45:0x00f1, B:47:0x00f8, B:49:0x0104, B:52:0x0118, B:56:0x0128, B:60:0x0134, B:63:0x013d, B:67:0x0146, B:71:0x0159, B:72:0x0163, B:74:0x016a, B:75:0x016e, B:76:0x0179, B:79:0x0186, B:82:0x018e, B:83:0x019d, B:146:0x02af, B:152:0x02df, B:155:0x02ec, B:156:0x02f0, B:150:0x02d8, B:147:0x02b3, B:124:0x0231, B:126:0x023b, B:127:0x0240, B:129:0x0267, B:130:0x026e, B:134:0x0277), top: B:181:0x004f, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b7 A[Catch: IOException -> 0x02f5, XmlPullParserException -> 0x02f7, TryCatch #6 {IOException -> 0x02f5, XmlPullParserException -> 0x02f7, blocks: (B:30:0x007d, B:34:0x00b9, B:36:0x00c0, B:37:0x00c4, B:39:0x00ca, B:41:0x00d4, B:86:0x01ab, B:88:0x01b2, B:90:0x01b7, B:92:0x01bd, B:94:0x01c3, B:106:0x01e8, B:109:0x01ee, B:116:0x01fa, B:118:0x01fe, B:120:0x020c, B:122:0x0221, B:144:0x02a5, B:121:0x0217, B:97:0x01cd, B:99:0x01da, B:123:0x022c, B:141:0x029b, B:142:0x029f, B:137:0x0292, B:42:0x00e5, B:43:0x00ea, B:45:0x00f1, B:47:0x00f8, B:49:0x0104, B:52:0x0118, B:56:0x0128, B:60:0x0134, B:63:0x013d, B:67:0x0146, B:71:0x0159, B:72:0x0163, B:74:0x016a, B:75:0x016e, B:76:0x0179, B:79:0x0186, B:82:0x018e, B:83:0x019d, B:146:0x02af, B:152:0x02df, B:155:0x02ec, B:156:0x02f0, B:150:0x02d8, B:147:0x02b3, B:124:0x0231, B:126:0x023b, B:127:0x0240, B:129:0x0267, B:130:0x026e, B:134:0x0277), top: B:181:0x004f, inners: #4, #5 }] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface c(android.content.Context r26, android.content.res.Resources r27, android.util.TypedValue r28, int r29, int r30, defpackage.cmd r31, boolean r32, boolean r33) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 845
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cme.c(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, cmd, boolean, boolean):android.graphics.Typeface");
    }
}
