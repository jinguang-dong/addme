package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kuw implements kun {
    private final pbn a;
    private final pbc b;
    private final owf c;
    private final owf d;
    private final nms e;
    private final boolean f;
    private final int g;
    private final boolean h;
    private final rwc i;
    private final kuj j;
    private final syw k;
    private final khl l;
    private final Optional m;
    private final juv n;
    private final owf o;
    private final ibb p;
    private final boolean q;
    private final mwq r;

    public kuw(pbn pbnVar, pbb pbbVar, mwq mwqVar, owf owfVar, owf owfVar2, nms nmsVar, hbj hbjVar, kgw kgwVar, uem uemVar, kuj kujVar, our ourVar, syw sywVar, khl khlVar, Optional optional, juv juvVar, owf owfVar3, boolean z, ibb ibbVar) {
        rwc rwcVarJ;
        this.a = pbnVar;
        pbc pbcVarA = pbbVar.a("PckConv3A");
        this.b = pbcVarA;
        this.r = mwqVar;
        this.c = owfVar;
        this.d = owfVar2;
        this.e = nmsVar;
        this.f = hbjVar.p(hac.y);
        this.g = ((Integer) hbjVar.a(hac.g).orElse(3000)).intValue();
        boolean zP = hbjVar.p(gze.i);
        this.h = zP;
        this.j = kujVar;
        this.k = sywVar;
        this.l = khlVar;
        this.m = optional;
        this.n = juvVar;
        this.o = owfVar3;
        this.q = z;
        this.p = ibbVar;
        if (zP) {
            hwt hwtVar = (hwt) uemVar.a();
            String strValueOf = String.valueOf(String.valueOf(kgwVar.l()));
            fbz fbzVar = new fbz(kgwVar, hwtVar, pbcVarA, "conv3A-".concat(strValueOf), ((Float) hbjVar.e(gze.j).orElse(Float.valueOf(300.0f))).floatValue());
            ourVar.d(fbzVar);
            fbzVar.b();
            rwcVarJ = rwc.j(fbzVar);
        } else {
            rwcVarJ = rvk.a;
        }
        this.i = rwcVarJ;
    }

    private final boolean c(int i) {
        if (i != 0) {
            return (i == 4 || i == 2) && ((ltq) this.c.dL()).equals(ltq.ON_LOCKED);
        }
        throw null;
    }

    @Override // defpackage.kun
    public final syu a(pfz pfzVar, pen penVar) {
        return this.k.submit(new efk(this, pfzVar, penVar, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0343 A[Catch: all -> 0x05b5, CancellationException | ExecutionException -> 0x05b7, CancellationException | ExecutionException -> 0x05b7, TryCatch #12 {CancellationException | ExecutionException -> 0x05b7, blocks: (B:7:0x003b, B:9:0x0093, B:17:0x00ad, B:19:0x00b8, B:24:0x0128, B:26:0x012e, B:28:0x015a, B:31:0x0164, B:131:0x0356, B:131:0x0356, B:133:0x038d, B:133:0x038d, B:135:0x03ba, B:135:0x03ba, B:139:0x03c5, B:139:0x03c5, B:141:0x03cb, B:141:0x03cb, B:143:0x03d3, B:143:0x03d3, B:147:0x03de, B:147:0x03de, B:149:0x03e4, B:149:0x03e4, B:151:0x03ec, B:151:0x03ec, B:225:0x0579, B:225:0x0579, B:227:0x0580, B:227:0x0580, B:228:0x0585, B:228:0x0585, B:233:0x0596, B:233:0x0596, B:230:0x058e, B:230:0x058e, B:231:0x0593, B:231:0x0593, B:53:0x0193, B:57:0x01c1, B:61:0x01ca, B:65:0x01d1, B:67:0x01d7, B:69:0x01ed, B:74:0x01fb, B:76:0x0207, B:77:0x020e, B:79:0x0212, B:86:0x0226, B:99:0x026a, B:99:0x026a, B:105:0x028c, B:105:0x028c, B:104:0x0280, B:104:0x0280, B:111:0x0295, B:111:0x0295, B:112:0x02a6, B:112:0x02a6, B:114:0x02a9, B:114:0x02a9, B:115:0x02ba, B:115:0x02ba, B:118:0x02c0, B:118:0x02c0, B:122:0x02d9, B:122:0x02d9, B:128:0x033d, B:128:0x033d, B:129:0x0342, B:129:0x0342, B:127:0x0337, B:127:0x0337, B:130:0x0343, B:130:0x0343, B:236:0x05b4, B:236:0x05b4, B:20:0x00ea, B:22:0x00f0, B:23:0x0126), top: B:258:0x003b, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04ba A[Catch: all -> 0x0539, TryCatch #11 {all -> 0x0539, blocks: (B:173:0x0449, B:175:0x044f, B:177:0x0460, B:179:0x046c, B:182:0x0475, B:184:0x0480, B:193:0x04ba, B:195:0x04c8, B:186:0x0485, B:188:0x0491, B:190:0x0497, B:198:0x04e9, B:201:0x050d), top: B:261:0x0442 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0532 A[Catch: all -> 0x0546, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0546, blocks: (B:169:0x043e, B:204:0x0532, B:214:0x0545, B:213:0x0542, B:210:0x053d), top: B:247:0x043e, outer: #6, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0556 A[Catch: all -> 0x058d, TRY_LEAVE, TryCatch #6 {all -> 0x058d, blocks: (B:155:0x03f7, B:157:0x03ff, B:159:0x0407, B:168:0x041e, B:205:0x0535, B:221:0x0550, B:220:0x054d, B:223:0x0556, B:169:0x043e, B:204:0x0532, B:214:0x0545, B:213:0x0542, B:210:0x053d, B:217:0x0548), top: B:254:0x03f7, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0580 A[Catch: all -> 0x05b5, CancellationException | ExecutionException -> 0x05b7, CancellationException | ExecutionException -> 0x05b7, TryCatch #12 {CancellationException | ExecutionException -> 0x05b7, blocks: (B:7:0x003b, B:9:0x0093, B:17:0x00ad, B:19:0x00b8, B:24:0x0128, B:26:0x012e, B:28:0x015a, B:31:0x0164, B:131:0x0356, B:131:0x0356, B:133:0x038d, B:133:0x038d, B:135:0x03ba, B:135:0x03ba, B:139:0x03c5, B:139:0x03c5, B:141:0x03cb, B:141:0x03cb, B:143:0x03d3, B:143:0x03d3, B:147:0x03de, B:147:0x03de, B:149:0x03e4, B:149:0x03e4, B:151:0x03ec, B:151:0x03ec, B:225:0x0579, B:225:0x0579, B:227:0x0580, B:227:0x0580, B:228:0x0585, B:228:0x0585, B:233:0x0596, B:233:0x0596, B:230:0x058e, B:230:0x058e, B:231:0x0593, B:231:0x0593, B:53:0x0193, B:57:0x01c1, B:61:0x01ca, B:65:0x01d1, B:67:0x01d7, B:69:0x01ed, B:74:0x01fb, B:76:0x0207, B:77:0x020e, B:79:0x0212, B:86:0x0226, B:99:0x026a, B:99:0x026a, B:105:0x028c, B:105:0x028c, B:104:0x0280, B:104:0x0280, B:111:0x0295, B:111:0x0295, B:112:0x02a6, B:112:0x02a6, B:114:0x02a9, B:114:0x02a9, B:115:0x02ba, B:115:0x02ba, B:118:0x02c0, B:118:0x02c0, B:122:0x02d9, B:122:0x02d9, B:128:0x033d, B:128:0x033d, B:129:0x0342, B:129:0x0342, B:127:0x0337, B:127:0x0337, B:130:0x0343, B:130:0x0343, B:236:0x05b4, B:236:0x05b4, B:20:0x00ea, B:22:0x00f0, B:23:0x0126), top: B:258:0x003b, outer: #9 }] */
    /* JADX WARN: Type inference failed for: r16v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v11, types: [pdk] */
    /* JADX WARN: Type inference failed for: r16v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.kgd b(defpackage.pfz r21, defpackage.pen r22) {
        /*
            Method dump skipped, instructions count: 1502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kuw.b(pfz, pen):kgd");
    }
}
