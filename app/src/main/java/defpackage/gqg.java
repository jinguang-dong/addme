package defpackage;

import android.content.Context;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gqg {
    public static final sgv a = sgv.g("gqg");
    public static final Pattern b = Pattern.compile("^([0-9]+)\\.([0-9]+)\\.([0-9]+).*");
    public final Context c;
    public final gpn d;
    public final pql e;
    public final grj f;
    public int g;
    public int h;
    public nnw i;
    public final rww j;
    private final iso k;

    public gqg(Context context, iso isoVar, gpn gpnVar, pql pqlVar, grj grjVar, hbj hbjVar) {
        this.c = context;
        this.k = isoVar;
        this.d = gpnVar;
        this.e = pqlVar;
        this.f = grjVar;
        this.j = rnt.y(new quy(hbjVar, context, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.String b(defpackage.rgb r4, java.lang.String r5) {
        /*
            rgc r0 = r4.c()
            rwc r0 = r0.b
            rgc r1 = r4.c()
            java.lang.String r1 = r1.a
            boolean r2 = r0.h()
            if (r2 != 0) goto L17
            java.lang.String r0 = defpackage.ezh.w(r1)
            goto L21
        L17:
            java.lang.Object r0 = r0.c()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = defpackage.ezh.w(r0)
        L21:
            rfw r2 = r4.b()
            rfw r3 = defpackage.rfw.QR
            if (r2 != r3) goto L30
            int r2 = r0.length()
            if (r2 != 0) goto L30
            goto L5a
        L30:
            rfw r4 = r4.b()
            rfw r5 = defpackage.rfw.URL
            if (r4 != r5) goto L59
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L59
            rvk r4 = defpackage.rvk.a
            java.net.URI r5 = new java.net.URI     // Catch: java.net.URISyntaxException -> L49
            r5.<init>(r1)     // Catch: java.net.URISyntaxException -> L49
            rwc r4 = defpackage.grl.a(r5)     // Catch: java.net.URISyntaxException -> L49
        L49:
            boolean r5 = r4.h()
            if (r5 != 0) goto L54
            java.lang.String r5 = defpackage.ezh.w(r1)
            goto L5a
        L54:
            java.lang.Object r5 = r4.c()
            goto L5a
        L59:
            r5 = r0
        L5a:
            java.lang.String r5 = (java.lang.String) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gqg.b(rgb, java.lang.String):java.lang.String");
    }

    private static final boolean c(rfw rfwVar) {
        int iOrdinal = rfwVar.ordinal();
        return iOrdinal == 2 || iOrdinal == 4 || iOrdinal == 24 || iOrdinal == 28;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x010b, code lost:
    
        r4 = new java.lang.String(j$.util.Base64.getDecoder().decode((java.lang.String) r4.get(1)));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:341:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0935  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0998  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0a35  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0a3e  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0a77  */
    /* JADX WARN: Type inference failed for: r5v39, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [int] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.gpr a(defpackage.rgb r24, long r25) throws defpackage.rfr {
        /*
            Method dump skipped, instructions count: 2810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gqg.a(rgb, long):gpr");
    }
}
