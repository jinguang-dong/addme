package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kxp {
    public static final sgv a = sgv.g("kxp");
    private final pbn b;
    private final kqp c;
    private final kps d;
    private final hzs e;
    private final iaq f;
    private final hxs g;
    private final rww h;
    private final hyh i;
    private final hzj j;
    private final pjo k;
    private final let l;
    private final uem m;
    private final rwc n;
    private final iec o;
    private final lat p;
    private final kuj q;
    private final owf r;
    private final owf s;
    private final kvg t;
    private final laq u;
    private final kel v;
    private final hbj w;
    private final cxb x;

    public kxp(pbn pbnVar, kqp kqpVar, kps kpsVar, hzs hzsVar, iaq iaqVar, hxs hxsVar, cxb cxbVar, rww rwwVar, hyh hyhVar, pjo pjoVar, let letVar, hzj hzjVar, uem uemVar, rwc rwcVar, hbj hbjVar, iec iecVar, lat latVar, kuj kujVar, owf owfVar, owf owfVar2, kvg kvgVar, laq laqVar, kel kelVar) {
        this.b = pbnVar;
        this.c = kqpVar;
        this.d = kpsVar;
        this.e = hzsVar;
        this.f = iaqVar;
        this.g = hxsVar;
        this.x = cxbVar;
        this.h = rwwVar;
        this.i = hyhVar;
        this.k = pjoVar;
        this.l = letVar;
        this.j = hzjVar;
        this.m = uemVar;
        this.n = rwcVar;
        this.w = hbjVar;
        this.o = iecVar;
        this.p = latVar;
        this.q = kujVar;
        this.r = owfVar;
        this.s = owfVar2;
        this.t = kvgVar;
        this.u = laqVar;
        this.v = kelVar;
    }

    private final rwc b(hxu hxuVar) {
        rwc rwcVarI;
        kuj kujVar;
        if (!hxuVar.m) {
            return rvk.a;
        }
        szh szhVar = new szh();
        kxo kxoVar = new kxo(szhVar);
        try {
            try {
                this.q.o(kxoVar);
                rwcVarI = rwc.i((pnx) szhVar.t(140L, TimeUnit.MILLISECONDS));
                kujVar = this.q;
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                ((sgt) ((sgt) a.c().i(e)).M(3631)).s("Not able to get partial frame metadata");
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                rwcVarI = rvk.a;
                kujVar = this.q;
            }
            kujVar.p(kxoVar);
            return rwcVarI;
        } catch (Throwable th) {
            this.q.p(kxoVar);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0359 A[Catch: all -> 0x0763, TryCatch #2 {all -> 0x0763, blocks: (B:155:0x0352, B:157:0x0359, B:158:0x035e, B:160:0x0373, B:162:0x0389, B:168:0x03b7, B:170:0x03d1, B:172:0x03e3, B:174:0x03f4, B:180:0x040a, B:186:0x042b, B:192:0x043c, B:197:0x046a, B:219:0x0511, B:226:0x0572, B:228:0x059e, B:242:0x05f8, B:229:0x05a8, B:231:0x05bc, B:232:0x05c7, B:234:0x05cf, B:236:0x05d8, B:238:0x05df, B:240:0x05e7, B:241:0x05ea, B:235:0x05d4, B:163:0x0397, B:165:0x039b, B:167:0x039f), top: B:335:0x0352 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x035e A[Catch: all -> 0x0763, TryCatch #2 {all -> 0x0763, blocks: (B:155:0x0352, B:157:0x0359, B:158:0x035e, B:160:0x0373, B:162:0x0389, B:168:0x03b7, B:170:0x03d1, B:172:0x03e3, B:174:0x03f4, B:180:0x040a, B:186:0x042b, B:192:0x043c, B:197:0x046a, B:219:0x0511, B:226:0x0572, B:228:0x059e, B:242:0x05f8, B:229:0x05a8, B:231:0x05bc, B:232:0x05c7, B:234:0x05cf, B:236:0x05d8, B:238:0x05df, B:240:0x05e7, B:241:0x05ea, B:235:0x05d4, B:163:0x0397, B:165:0x039b, B:167:0x039f), top: B:335:0x0352 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04c3 A[Catch: all -> 0x075f, TryCatch #32 {all -> 0x075f, blocks: (B:202:0x048a, B:210:0x04b5, B:214:0x04cd, B:216:0x04e9, B:217:0x04eb, B:203:0x0491, B:207:0x04ab, B:209:0x04b3, B:213:0x04c3), top: B:372:0x0432 }] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0790 A[Catch: all -> 0x07a2, TRY_LEAVE, TryCatch #1 {all -> 0x07a2, blocks: (B:314:0x0784, B:315:0x0789, B:318:0x0790), top: B:334:0x0203 }] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0434 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x02fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0118 A[Catch: all -> 0x0128, TRY_LEAVE, TryCatch #5 {all -> 0x0128, blocks: (B:22:0x00e8, B:38:0x0118, B:35:0x0112, B:34:0x010f, B:24:0x00ee, B:26:0x00f7, B:31:0x010a), top: B:337:0x00e8, inners: #19, #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0154 A[Catch: all -> 0x07a6, TryCatch #4 {all -> 0x07a6, blocks: (B:3:0x000e, B:5:0x0018, B:6:0x0027, B:13:0x0096, B:16:0x009d, B:18:0x00a3, B:67:0x0197, B:76:0x01e0, B:79:0x01e7, B:93:0x0215, B:96:0x022b, B:107:0x024f, B:104:0x0239, B:103:0x0236, B:111:0x0259, B:106:0x023b, B:86:0x01fe, B:83:0x01f4, B:70:0x01a2, B:72:0x01bb, B:74:0x01c1, B:19:0x00b6, B:20:0x00c7, B:21:0x00dd, B:39:0x011b, B:42:0x0122, B:64:0x0165, B:66:0x0192, B:65:0x017f, B:61:0x015d, B:58:0x0154, B:50:0x0132, B:49:0x012f, B:52:0x0134, B:54:0x0146, B:12:0x0092, B:9:0x0089), top: B:336:0x000e, inners: #9, #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015d A[Catch: all -> 0x07a6, TryCatch #4 {all -> 0x07a6, blocks: (B:3:0x000e, B:5:0x0018, B:6:0x0027, B:13:0x0096, B:16:0x009d, B:18:0x00a3, B:67:0x0197, B:76:0x01e0, B:79:0x01e7, B:93:0x0215, B:96:0x022b, B:107:0x024f, B:104:0x0239, B:103:0x0236, B:111:0x0259, B:106:0x023b, B:86:0x01fe, B:83:0x01f4, B:70:0x01a2, B:72:0x01bb, B:74:0x01c1, B:19:0x00b6, B:20:0x00c7, B:21:0x00dd, B:39:0x011b, B:42:0x0122, B:64:0x0165, B:66:0x0192, B:65:0x017f, B:61:0x015d, B:58:0x0154, B:50:0x0132, B:49:0x012f, B:52:0x0134, B:54:0x0146, B:12:0x0092, B:9:0x0089), top: B:336:0x000e, inners: #9, #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017f A[Catch: all -> 0x07a6, TryCatch #4 {all -> 0x07a6, blocks: (B:3:0x000e, B:5:0x0018, B:6:0x0027, B:13:0x0096, B:16:0x009d, B:18:0x00a3, B:67:0x0197, B:76:0x01e0, B:79:0x01e7, B:93:0x0215, B:96:0x022b, B:107:0x024f, B:104:0x0239, B:103:0x0236, B:111:0x0259, B:106:0x023b, B:86:0x01fe, B:83:0x01f4, B:70:0x01a2, B:72:0x01bb, B:74:0x01c1, B:19:0x00b6, B:20:0x00c7, B:21:0x00dd, B:39:0x011b, B:42:0x0122, B:64:0x0165, B:66:0x0192, B:65:0x017f, B:61:0x015d, B:58:0x0154, B:50:0x0132, B:49:0x012f, B:52:0x0134, B:54:0x0146, B:12:0x0092, B:9:0x0089), top: B:336:0x000e, inners: #9, #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a2 A[Catch: all -> 0x07a6, TryCatch #4 {all -> 0x07a6, blocks: (B:3:0x000e, B:5:0x0018, B:6:0x0027, B:13:0x0096, B:16:0x009d, B:18:0x00a3, B:67:0x0197, B:76:0x01e0, B:79:0x01e7, B:93:0x0215, B:96:0x022b, B:107:0x024f, B:104:0x0239, B:103:0x0236, B:111:0x0259, B:106:0x023b, B:86:0x01fe, B:83:0x01f4, B:70:0x01a2, B:72:0x01bb, B:74:0x01c1, B:19:0x00b6, B:20:0x00c7, B:21:0x00dd, B:39:0x011b, B:42:0x0122, B:64:0x0165, B:66:0x0192, B:65:0x017f, B:61:0x015d, B:58:0x0154, B:50:0x0132, B:49:0x012f, B:52:0x0134, B:54:0x0146, B:12:0x0092, B:9:0x0089), top: B:336:0x000e, inners: #9, #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f4 A[Catch: all -> 0x07a6, TryCatch #4 {all -> 0x07a6, blocks: (B:3:0x000e, B:5:0x0018, B:6:0x0027, B:13:0x0096, B:16:0x009d, B:18:0x00a3, B:67:0x0197, B:76:0x01e0, B:79:0x01e7, B:93:0x0215, B:96:0x022b, B:107:0x024f, B:104:0x0239, B:103:0x0236, B:111:0x0259, B:106:0x023b, B:86:0x01fe, B:83:0x01f4, B:70:0x01a2, B:72:0x01bb, B:74:0x01c1, B:19:0x00b6, B:20:0x00c7, B:21:0x00dd, B:39:0x011b, B:42:0x0122, B:64:0x0165, B:66:0x0192, B:65:0x017f, B:61:0x015d, B:58:0x0154, B:50:0x0132, B:49:0x012f, B:52:0x0134, B:54:0x0146, B:12:0x0092, B:9:0x0089), top: B:336:0x000e, inners: #9, #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fe A[Catch: all -> 0x07a6, TRY_LEAVE, TryCatch #4 {all -> 0x07a6, blocks: (B:3:0x000e, B:5:0x0018, B:6:0x0027, B:13:0x0096, B:16:0x009d, B:18:0x00a3, B:67:0x0197, B:76:0x01e0, B:79:0x01e7, B:93:0x0215, B:96:0x022b, B:107:0x024f, B:104:0x0239, B:103:0x0236, B:111:0x0259, B:106:0x023b, B:86:0x01fe, B:83:0x01f4, B:70:0x01a2, B:72:0x01bb, B:74:0x01c1, B:19:0x00b6, B:20:0x00c7, B:21:0x00dd, B:39:0x011b, B:42:0x0122, B:64:0x0165, B:66:0x0192, B:65:0x017f, B:61:0x015d, B:58:0x0154, B:50:0x0132, B:49:0x012f, B:52:0x0134, B:54:0x0146, B:12:0x0092, B:9:0x0089), top: B:336:0x000e, inners: #9, #30 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [kxp] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v103, types: [kel] */
    /* JADX WARN: Type inference failed for: r2v108, types: [java.lang.Object, kml] */
    /* JADX WARN: Type inference failed for: r2v118, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r2v123, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r2v134, types: [java.lang.Object, kml] */
    /* JADX WARN: Type inference failed for: r2v14, types: [poe] */
    /* JADX WARN: Type inference failed for: r2v157, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r2v30, types: [pjr] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r2v39, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r2v50, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r2v58, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r39v0, types: [our] */
    /* JADX WARN: Type inference failed for: r3v14, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r3v18, types: [poe] */
    /* JADX WARN: Type inference failed for: r3v19, types: [poe] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v30, types: [poe] */
    /* JADX WARN: Type inference failed for: r3v46, types: [iby] */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v52, types: [hzs] */
    /* JADX WARN: Type inference failed for: r3v53, types: [iby] */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r4v20, types: [lat] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r4v75, types: [hzs] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, lss] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.laa a(defpackage.pfz r34, defpackage.gga r35, long r36, defpackage.hxu r38, defpackage.our r39, defpackage.pdv r40, defpackage.pdv r41, defpackage.kxl r42, defpackage.kwt r43, defpackage.kit r44, boolean r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2006
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kxp.a(pfz, gga, long, hxu, our, pdv, pdv, kxl, kwt, kit, boolean):laa");
    }
}
