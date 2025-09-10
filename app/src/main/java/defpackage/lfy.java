package defpackage;

import com.google.android.apps.camera.dynamicdepth.DynamicDepthResult;
import com.google.googlex.gcam.HdrGainMapInfo;
import com.google.googlex.gcam.InterleavedImageU16;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.PortraitRequest;
import com.google.googlex.gcam.ShotMetadata;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lfy implements kiz {
    public tdi a;
    public DynamicDepthResult b = null;
    public HdrGainMapInfo c = null;
    final /* synthetic */ long d;
    final /* synthetic */ PortraitRequest e;
    final /* synthetic */ boolean f;
    final /* synthetic */ tcu g;
    final /* synthetic */ ShotMetadata h;
    final /* synthetic */ tcu i;
    final /* synthetic */ ShotMetadata j;
    final /* synthetic */ InterleavedImageU16 k;
    final /* synthetic */ InterleavedImageU8 l;
    final /* synthetic */ lgb m;
    final /* synthetic */ kgw n;
    final /* synthetic */ iia o;

    public lfy(lgb lgbVar, long j, PortraitRequest portraitRequest, kgw kgwVar, iia iiaVar, boolean z, tcu tcuVar, ShotMetadata shotMetadata, tcu tcuVar2, ShotMetadata shotMetadata2, InterleavedImageU16 interleavedImageU16, InterleavedImageU8 interleavedImageU8) {
        this.d = j;
        this.e = portraitRequest;
        this.n = kgwVar;
        this.o = iiaVar;
        this.f = z;
        this.g = tcuVar;
        this.h = shotMetadata;
        this.i = tcuVar2;
        this.j = shotMetadata2;
        this.k = interleavedImageU16;
        this.l = interleavedImageU8;
        this.m = lgbVar;
    }

    @Override // defpackage.kiz
    public final syu a() {
        final szh szhVar = new szh();
        final szh szhVar2 = new szh();
        sgv sgvVar = lgb.a;
        final tcu tcuVar = this.g;
        final PortraitRequest portraitRequest = this.e;
        final ShotMetadata shotMetadata = this.h;
        final kgw kgwVar = this.n;
        final tcu tcuVar2 = this.i;
        final iia iiaVar = this.o;
        final ShotMetadata shotMetadata2 = this.j;
        final InterleavedImageU8 interleavedImageU8 = this.l;
        final long j = this.d;
        final boolean z = this.f;
        final InterleavedImageU16 interleavedImageU16 = this.k;
        this.m.e.execute(new Runnable() { // from class: lfx
            /* JADX WARN: Code restructure failed: missing block: B:194:0x0425, code lost:
            
                if (r33 == null) goto L196;
             */
            /* JADX WARN: Code restructure failed: missing block: B:195:0x0427, code lost:
            
                r33.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:196:0x042a, code lost:
            
                if (r31 == null) goto L198;
             */
            /* JADX WARN: Code restructure failed: missing block: B:197:0x042c, code lost:
            
                r31.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:198:0x042f, code lost:
            
                if (r30 == null) goto L200;
             */
            /* JADX WARN: Code restructure failed: missing block: B:199:0x0431, code lost:
            
                r30.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:200:0x0434, code lost:
            
                if (r35 == null) goto L202;
             */
            /* JADX WARN: Code restructure failed: missing block: B:201:0x0436, code lost:
            
                r35.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:202:0x0439, code lost:
            
                if (r28 == null) goto L204;
             */
            /* JADX WARN: Code restructure failed: missing block: B:203:0x043b, code lost:
            
                r28.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:204:0x043e, code lost:
            
                if (r27 == null) goto L206;
             */
            /* JADX WARN: Code restructure failed: missing block: B:205:0x0440, code lost:
            
                r27.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:206:0x0443, code lost:
            
                if (r26 == null) goto L208;
             */
            /* JADX WARN: Code restructure failed: missing block: B:207:0x0445, code lost:
            
                r26.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:208:0x0448, code lost:
            
                if (r34 == null) goto L210;
             */
            /* JADX WARN: Code restructure failed: missing block: B:209:0x044a, code lost:
            
                r34.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:210:0x044d, code lost:
            
                if (r32 == null) goto L439;
             */
            /* JADX WARN: Code restructure failed: missing block: B:211:0x044f, code lost:
            
                r32.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:212:0x0452, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:439:?, code lost:
            
                return;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:365:0x04e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00c2 A[Catch: all -> 0x0525, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x0525, blocks: (B:29:0x009e, B:43:0x00dc, B:46:0x00e6, B:36:0x00c2), top: B:369:0x009e }] */
            /* JADX WARN: Removed duplicated region for block: B:371:0x0562 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:391:0x0534 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:404:0x04fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:412:0x013e A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:426:0x054c A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:428:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:437:0x051a A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00dc A[Catch: all -> 0x0525, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x0525, blocks: (B:29:0x009e, B:43:0x00dc, B:46:0x00e6, B:36:0x00c2), top: B:369:0x009e }] */
            /* JADX WARN: Removed duplicated region for block: B:443:? A[Catch: all -> 0x04e9, SYNTHETIC, TRY_LEAVE, TryCatch #10 {all -> 0x04e9, blocks: (B:197:0x042c, B:273:0x04e8, B:272:0x04e5, B:269:0x04e0), top: B:377:0x012b, inners: #3 }] */
            /* JADX WARN: Removed duplicated region for block: B:445:? A[Catch: all -> 0x0507, SYNTHETIC, TRY_LEAVE, TryCatch #30 {all -> 0x0507, blocks: (B:199:0x0431, B:284:0x0506, B:283:0x0503, B:280:0x04fe), top: B:410:0x0127, inners: #27 }] */
            /* JADX WARN: Removed duplicated region for block: B:447:? A[Catch: all -> 0x0523, SYNTHETIC, TRY_LEAVE, TryCatch #2 {all -> 0x0523, blocks: (B:201:0x0436, B:295:0x0522, B:294:0x051f, B:291:0x051a), top: B:364:0x00e6, inners: #47 }] */
            /* JADX WARN: Removed duplicated region for block: B:449:? A[Catch: all -> 0x053d, SYNTHETIC, TRY_LEAVE, TryCatch #22 {all -> 0x053d, blocks: (B:203:0x043b, B:306:0x053c, B:305:0x0539, B:302:0x0534), top: B:397:0x0098, inners: #19 }] */
            /* JADX WARN: Removed duplicated region for block: B:451:? A[Catch: all -> 0x0555, SYNTHETIC, TRY_LEAVE, TryCatch #43 {all -> 0x0555, blocks: (B:205:0x0440, B:317:0x0554, B:316:0x0551, B:313:0x054c), top: B:380:0x0092, inners: #40 }] */
            /* JADX WARN: Removed duplicated region for block: B:453:? A[Catch: all -> 0x056b, SYNTHETIC, TRY_LEAVE, TryCatch #12 {all -> 0x056b, blocks: (B:207:0x0445, B:328:0x056a, B:327:0x0567, B:324:0x0562), top: B:380:0x0092, inners: #6 }] */
            /* JADX WARN: Removed duplicated region for block: B:57:0x0123  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x015e  */
            /* JADX WARN: Removed duplicated region for block: B:72:0x0168  */
            /* JADX WARN: Type inference failed for: r0v102 */
            /* JADX WARN: Type inference failed for: r0v79 */
            /* JADX WARN: Type inference failed for: r0v81, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r11v2, types: [lgk] */
            /* JADX WARN: Type inference failed for: r1v0, types: [lfy] */
            /* JADX WARN: Type inference failed for: r1v1 */
            /* JADX WARN: Type inference failed for: r1v10 */
            /* JADX WARN: Type inference failed for: r1v11 */
            /* JADX WARN: Type inference failed for: r1v12 */
            /* JADX WARN: Type inference failed for: r1v13 */
            /* JADX WARN: Type inference failed for: r1v14 */
            /* JADX WARN: Type inference failed for: r1v15 */
            /* JADX WARN: Type inference failed for: r1v16 */
            /* JADX WARN: Type inference failed for: r1v17 */
            /* JADX WARN: Type inference failed for: r1v18 */
            /* JADX WARN: Type inference failed for: r1v19 */
            /* JADX WARN: Type inference failed for: r1v2, types: [szh] */
            /* JADX WARN: Type inference failed for: r1v20 */
            /* JADX WARN: Type inference failed for: r1v21 */
            /* JADX WARN: Type inference failed for: r1v22 */
            /* JADX WARN: Type inference failed for: r1v23 */
            /* JADX WARN: Type inference failed for: r1v24 */
            /* JADX WARN: Type inference failed for: r1v3 */
            /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r1v32 */
            /* JADX WARN: Type inference failed for: r1v33, types: [lgi] */
            /* JADX WARN: Type inference failed for: r1v34 */
            /* JADX WARN: Type inference failed for: r1v35 */
            /* JADX WARN: Type inference failed for: r1v36 */
            /* JADX WARN: Type inference failed for: r1v37 */
            /* JADX WARN: Type inference failed for: r1v38 */
            /* JADX WARN: Type inference failed for: r1v39 */
            /* JADX WARN: Type inference failed for: r1v4 */
            /* JADX WARN: Type inference failed for: r1v40 */
            /* JADX WARN: Type inference failed for: r1v41 */
            /* JADX WARN: Type inference failed for: r1v42 */
            /* JADX WARN: Type inference failed for: r1v43 */
            /* JADX WARN: Type inference failed for: r1v44 */
            /* JADX WARN: Type inference failed for: r1v45 */
            /* JADX WARN: Type inference failed for: r1v46 */
            /* JADX WARN: Type inference failed for: r1v47 */
            /* JADX WARN: Type inference failed for: r1v5 */
            /* JADX WARN: Type inference failed for: r1v50 */
            /* JADX WARN: Type inference failed for: r1v6 */
            /* JADX WARN: Type inference failed for: r1v7 */
            /* JADX WARN: Type inference failed for: r1v70 */
            /* JADX WARN: Type inference failed for: r1v71 */
            /* JADX WARN: Type inference failed for: r1v72 */
            /* JADX WARN: Type inference failed for: r1v8 */
            /* JADX WARN: Type inference failed for: r1v80 */
            /* JADX WARN: Type inference failed for: r1v81 */
            /* JADX WARN: Type inference failed for: r1v82 */
            /* JADX WARN: Type inference failed for: r1v83 */
            /* JADX WARN: Type inference failed for: r1v84 */
            /* JADX WARN: Type inference failed for: r1v9 */
            /* JADX WARN: Type inference failed for: r2v4, types: [sgt, shi] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 1449
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lfx.run():void");
            }
        });
        return szhVar;
    }

    @Override // defpackage.kiz
    public final syu b() {
        return ske.M(false);
    }
}
