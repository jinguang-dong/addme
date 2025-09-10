package defpackage;

import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lsa {
    public static final sgv a = sgv.g("lsa");
    private static final rww d = rnt.y(new qxd(1));
    public final Executor b;
    public final hbj c;
    private final File e;
    private final File f;
    private final mdy g;
    private final qqq h;

    public lsa(File file, qqq qqqVar, hbj hbjVar, mdy mdyVar, Executor executor) {
        this.e = new File(file, "inflight");
        this.f = new File(file, "inflight-mars");
        this.h = qqqVar;
        this.c = hbjVar;
        this.g = mdyVar;
        this.b = executor;
    }

    public final ltb a(lss lssVar) {
        File file = lssVar.n() == ltg.MARS_STORE ? this.f : this.e;
        lrz lrzVar = new lrz(this, new File(file, "medres-" + lssVar.f() + ".jpg"), lssVar);
        lssVar.y(lrzVar);
        return lrzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0170 A[Catch: all -> 0x0168, TRY_ENTER, TryCatch #2 {all -> 0x0168, blocks: (B:15:0x0025, B:17:0x002f, B:22:0x0055, B:24:0x006b, B:26:0x008b, B:28:0x0090, B:29:0x00a3, B:30:0x00a9, B:36:0x00bf, B:38:0x00f0, B:39:0x00f3, B:41:0x0105, B:42:0x0108, B:63:0x014e, B:62:0x014b, B:76:0x0170, B:78:0x0175, B:79:0x0178, B:27:0x008e, B:68:0x0154, B:69:0x0167), top: B:89:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0175 A[Catch: all -> 0x0168, TryCatch #2 {all -> 0x0168, blocks: (B:15:0x0025, B:17:0x002f, B:22:0x0055, B:24:0x006b, B:26:0x008b, B:28:0x0090, B:29:0x00a3, B:30:0x00a9, B:36:0x00bf, B:38:0x00f0, B:39:0x00f3, B:41:0x0105, B:42:0x0108, B:63:0x014e, B:62:0x014b, B:76:0x0170, B:78:0x0175, B:79:0x0178, B:27:0x008e, B:68:0x0154, B:69:0x0167), top: B:89:0x0025 }] */
    /* JADX WARN: Type inference failed for: r3v14, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r3v18, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r3v3, types: [sgt, shi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(boolean r22) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lsa.b(boolean):void");
    }
}
