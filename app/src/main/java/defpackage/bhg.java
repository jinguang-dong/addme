package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhg {
    public final uiq a;
    public boolean c;
    public bhf g;
    public rnu i;
    public final AtomicReference b = new AtomicReference(null);
    private final uiu j = new aml(this, 5);
    public final uiq d = new asj(this, 10);
    public final bdp e = new bdp(new bhf[16]);
    public final Object f = new Object();
    public long h = -1;

    public bhg(uiq uiqVar) {
        this.a = uiqVar;
    }

    public static final void c() {
        ayi.g("Unexpected notification");
        throw new uer();
    }

    public final void a() {
        this.i = bay.ak(this.j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x029a A[Catch: all -> 0x06a6, TryCatch #2 {all -> 0x06a6, blocks: (B:45:0x00b7, B:47:0x00bd, B:160:0x0301, B:51:0x00cd, B:53:0x00d3, B:55:0x00d9, B:57:0x00dd, B:60:0x00f2, B:62:0x0102, B:64:0x010d, B:66:0x0113, B:68:0x012e, B:69:0x0130, B:71:0x013c, B:73:0x0142, B:75:0x0146, B:78:0x0157, B:80:0x0167, B:82:0x0172, B:84:0x0178, B:86:0x0188, B:97:0x01bf, B:91:0x0194, B:92:0x019d, B:93:0x01a9, B:135:0x0294, B:137:0x029a, B:139:0x029e, B:142:0x02ab, B:144:0x02b7, B:146:0x02c4, B:148:0x02ca, B:149:0x02d4, B:155:0x02e3, B:156:0x02e6, B:103:0x01e1, B:105:0x01f5, B:107:0x020f, B:108:0x0211, B:110:0x021d, B:112:0x0223, B:114:0x0227, B:117:0x0234, B:119:0x0240, B:121:0x024d, B:123:0x0253, B:125:0x0263, B:131:0x0276, B:132:0x027b, B:133:0x0281, B:281:0x05a5, B:283:0x05ab, B:285:0x05b1, B:287:0x05c9, B:289:0x05cd, B:292:0x05da, B:294:0x05e9, B:296:0x05f6, B:298:0x05fc, B:300:0x060c, B:302:0x0620, B:304:0x062a, B:310:0x0646, B:318:0x067a, B:311:0x0650, B:313:0x0661, B:315:0x066c, B:319:0x0684, B:167:0x033b, B:169:0x0360, B:170:0x0373, B:172:0x0379, B:174:0x0381, B:178:0x038d, B:180:0x0395, B:182:0x039b, B:184:0x039f, B:187:0x03ac, B:189:0x03b9, B:191:0x03c6, B:193:0x03cc, B:195:0x03e7, B:196:0x03e9, B:198:0x03f7, B:200:0x03fd, B:202:0x0401, B:205:0x0412, B:207:0x0420, B:209:0x042d, B:211:0x0433, B:213:0x0443, B:225:0x0488, B:219:0x0457, B:220:0x045e, B:221:0x046c, B:259:0x0543, B:261:0x0549, B:263:0x054d, B:266:0x055a, B:268:0x0566, B:270:0x0573, B:272:0x0579, B:273:0x0583, B:277:0x058f, B:278:0x0592, B:231:0x04b5, B:232:0x04c4, B:234:0x04d4, B:235:0x04d6, B:237:0x04e2, B:239:0x04e8, B:241:0x04ec, B:244:0x04f9, B:246:0x0505, B:248:0x0512, B:250:0x0518, B:251:0x0522, B:255:0x052e, B:256:0x0531, B:257:0x0537), top: B:349:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ff A[EDGE_INSN: B:376:0x02ff->B:159:0x02ff BREAK  A[LOOP:8: B:142:0x02ab->B:155:0x02e3], PHI: r3 r25 r29 r30 r34 r35 r36 r37 r38 r44
      0x02ff: PHI (r3v28 java.util.HashMap) = (r3v29 java.util.HashMap), (r3v31 java.util.HashMap), (r3v31 java.util.HashMap), (r3v31 java.util.HashMap) binds: [B:158:0x02f2, B:136:0x0298, B:140:0x02a7, B:376:0x02ff] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r25v38 int) = (r25v36 int), (r25v39 int), (r25v39 int), (r25v42 int) binds: [B:158:0x02f2, B:136:0x0298, B:140:0x02a7, B:376:0x02ff] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r29v22 int) = (r29v23 int), (r29v27 int), (r29v27 int), (r29v27 int) binds: [B:158:0x02f2, B:136:0x0298, B:140:0x02a7, B:376:0x02ff] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r30v13 long) = (r30v14 long), (r30v15 long), (r30v15 long), (r30v15 long) binds: [B:158:0x02f2, B:136:0x0298, B:140:0x02a7, B:376:0x02ff] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r34v8 java.util.Set) = (r34v9 java.util.Set), (r34v11 java.util.Set), (r34v11 java.util.Set), (r34v11 java.util.Set) binds: [B:158:0x02f2, B:136:0x0298, B:140:0x02a7, B:376:0x02ff] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r35v8 java.lang.Object[]) = (r35v9 java.lang.Object[]), (r35v11 java.lang.Object[]), (r35v11 java.lang.Object[]), (r35v11 java.lang.Object[]) binds: [B:158:0x02f2, B:136:0x0298, B:140:0x02a7, B:376:0x02ff] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r36v8 int) = (r36v9 int), (r36v11 int), (r36v11 int), (r36v11 int) binds: [B:158:0x02f2, B:136:0x0298, B:140:0x02a7, B:376:0x02ff] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r37v8 int) = (r37v9 int), (r37v11 int), (r37v11 int), (r37v11 int) binds: [B:158:0x02f2, B:136:0x0298, B:140:0x02a7, B:376:0x02ff] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r38v4 java.lang.Object[]) = (r38v5 java.lang.Object[]), (r38v7 java.lang.Object[]), (r38v7 java.lang.Object[]), (r38v7 java.lang.Object[]) binds: [B:158:0x02f2, B:136:0x0298, B:140:0x02a7, B:376:0x02ff] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r44v18 zu) = (r44v19 zu), (r44v21 zu), (r44v21 zu), (r44v21 zu) binds: [B:158:0x02f2, B:136:0x0298, B:140:0x02a7, B:376:0x02ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x052c A[PHI: r25
      0x052c: PHI (r25v13 int) = (r25v12 int), (r25v14 int) binds: [B:245:0x0503, B:253:0x052a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0549 A[Catch: all -> 0x06a6, TryCatch #2 {all -> 0x06a6, blocks: (B:45:0x00b7, B:47:0x00bd, B:160:0x0301, B:51:0x00cd, B:53:0x00d3, B:55:0x00d9, B:57:0x00dd, B:60:0x00f2, B:62:0x0102, B:64:0x010d, B:66:0x0113, B:68:0x012e, B:69:0x0130, B:71:0x013c, B:73:0x0142, B:75:0x0146, B:78:0x0157, B:80:0x0167, B:82:0x0172, B:84:0x0178, B:86:0x0188, B:97:0x01bf, B:91:0x0194, B:92:0x019d, B:93:0x01a9, B:135:0x0294, B:137:0x029a, B:139:0x029e, B:142:0x02ab, B:144:0x02b7, B:146:0x02c4, B:148:0x02ca, B:149:0x02d4, B:155:0x02e3, B:156:0x02e6, B:103:0x01e1, B:105:0x01f5, B:107:0x020f, B:108:0x0211, B:110:0x021d, B:112:0x0223, B:114:0x0227, B:117:0x0234, B:119:0x0240, B:121:0x024d, B:123:0x0253, B:125:0x0263, B:131:0x0276, B:132:0x027b, B:133:0x0281, B:281:0x05a5, B:283:0x05ab, B:285:0x05b1, B:287:0x05c9, B:289:0x05cd, B:292:0x05da, B:294:0x05e9, B:296:0x05f6, B:298:0x05fc, B:300:0x060c, B:302:0x0620, B:304:0x062a, B:310:0x0646, B:318:0x067a, B:311:0x0650, B:313:0x0661, B:315:0x066c, B:319:0x0684, B:167:0x033b, B:169:0x0360, B:170:0x0373, B:172:0x0379, B:174:0x0381, B:178:0x038d, B:180:0x0395, B:182:0x039b, B:184:0x039f, B:187:0x03ac, B:189:0x03b9, B:191:0x03c6, B:193:0x03cc, B:195:0x03e7, B:196:0x03e9, B:198:0x03f7, B:200:0x03fd, B:202:0x0401, B:205:0x0412, B:207:0x0420, B:209:0x042d, B:211:0x0433, B:213:0x0443, B:225:0x0488, B:219:0x0457, B:220:0x045e, B:221:0x046c, B:259:0x0543, B:261:0x0549, B:263:0x054d, B:266:0x055a, B:268:0x0566, B:270:0x0573, B:272:0x0579, B:273:0x0583, B:277:0x058f, B:278:0x0592, B:231:0x04b5, B:232:0x04c4, B:234:0x04d4, B:235:0x04d6, B:237:0x04e2, B:239:0x04e8, B:241:0x04ec, B:244:0x04f9, B:246:0x0505, B:248:0x0512, B:250:0x0518, B:251:0x0522, B:255:0x052e, B:256:0x0531, B:257:0x0537), top: B:349:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x058d A[PHI: r25
      0x058d: PHI (r25v7 int) = (r25v6 int), (r25v8 int) binds: [B:267:0x0564, B:275:0x058b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05ab A[Catch: all -> 0x06a6, TryCatch #2 {all -> 0x06a6, blocks: (B:45:0x00b7, B:47:0x00bd, B:160:0x0301, B:51:0x00cd, B:53:0x00d3, B:55:0x00d9, B:57:0x00dd, B:60:0x00f2, B:62:0x0102, B:64:0x010d, B:66:0x0113, B:68:0x012e, B:69:0x0130, B:71:0x013c, B:73:0x0142, B:75:0x0146, B:78:0x0157, B:80:0x0167, B:82:0x0172, B:84:0x0178, B:86:0x0188, B:97:0x01bf, B:91:0x0194, B:92:0x019d, B:93:0x01a9, B:135:0x0294, B:137:0x029a, B:139:0x029e, B:142:0x02ab, B:144:0x02b7, B:146:0x02c4, B:148:0x02ca, B:149:0x02d4, B:155:0x02e3, B:156:0x02e6, B:103:0x01e1, B:105:0x01f5, B:107:0x020f, B:108:0x0211, B:110:0x021d, B:112:0x0223, B:114:0x0227, B:117:0x0234, B:119:0x0240, B:121:0x024d, B:123:0x0253, B:125:0x0263, B:131:0x0276, B:132:0x027b, B:133:0x0281, B:281:0x05a5, B:283:0x05ab, B:285:0x05b1, B:287:0x05c9, B:289:0x05cd, B:292:0x05da, B:294:0x05e9, B:296:0x05f6, B:298:0x05fc, B:300:0x060c, B:302:0x0620, B:304:0x062a, B:310:0x0646, B:318:0x067a, B:311:0x0650, B:313:0x0661, B:315:0x066c, B:319:0x0684, B:167:0x033b, B:169:0x0360, B:170:0x0373, B:172:0x0379, B:174:0x0381, B:178:0x038d, B:180:0x0395, B:182:0x039b, B:184:0x039f, B:187:0x03ac, B:189:0x03b9, B:191:0x03c6, B:193:0x03cc, B:195:0x03e7, B:196:0x03e9, B:198:0x03f7, B:200:0x03fd, B:202:0x0401, B:205:0x0412, B:207:0x0420, B:209:0x042d, B:211:0x0433, B:213:0x0443, B:225:0x0488, B:219:0x0457, B:220:0x045e, B:221:0x046c, B:259:0x0543, B:261:0x0549, B:263:0x054d, B:266:0x055a, B:268:0x0566, B:270:0x0573, B:272:0x0579, B:273:0x0583, B:277:0x058f, B:278:0x0592, B:231:0x04b5, B:232:0x04c4, B:234:0x04d4, B:235:0x04d6, B:237:0x04e2, B:239:0x04e8, B:241:0x04ec, B:244:0x04f9, B:246:0x0505, B:248:0x0512, B:250:0x0518, B:251:0x0522, B:255:0x052e, B:256:0x0531, B:257:0x0537), top: B:349:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x06b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x059d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1736
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhg.b():boolean");
    }
}
