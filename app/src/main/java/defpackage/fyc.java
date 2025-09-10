package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fyc implements paq {
    public static final sgv a = sgv.g("fyc");
    public syu b;
    public gdv c;
    public final Object d = new Object();
    private final geh e;
    private final gav f;
    private final pbn g;
    private final ngw h;

    public fyc(got gotVar, gav gavVar, ngw ngwVar, pbn pbnVar) {
        this.e = (geh) gotVar.c;
        this.f = gavVar;
        this.h = ngwVar;
        this.g = pbnVar;
    }

    private final void c() {
        synchronized (this.d) {
            gdv gdvVar = this.c;
            if (gdvVar != null) {
                gdvVar.close();
                this.c = null;
            }
            syu syuVar = this.b;
            if (syuVar != null) {
                syuVar.cancel(true);
                this.b = null;
            }
        }
    }

    public final gdv a(gaw gawVar) {
        gdv gdvVar;
        try {
            try {
                this.g.f("VRP#getNew");
                synchronized (this.d) {
                    gdvVar = (gdv) ((swn) b(gawVar)).s();
                }
            } catch (InterruptedException | ExecutionException e) {
                ((sgt) ((sgt) a.b().i(e)).M(547)).s("Error creating video recorder: ");
                gdvVar = null;
            }
            return gdvVar;
        } finally {
            this.g.g();
        }
    }

    final syu b(final gaw gawVar) {
        syu syuVar;
        synchronized (this.d) {
            c();
            final geh gehVar = this.e;
            final ngw ngwVar = this.h;
            final gau gauVarA = this.f.a();
            synchronized (gehVar.m) {
                if (gehVar.o) {
                    gehVar.o = false;
                    gehVar.y.w(gdo.VIDEO_RECORDER).d(gehVar);
                    gehVar.t = ((get) gehVar.c).a();
                }
            }
            syu syuVarR = ske.R(new sxh() { // from class: geg
                /* JADX WARN: Removed duplicated region for block: B:47:0x0152 A[Catch: all -> 0x01f9, TryCatch #3 {, blocks: (B:13:0x0028, B:15:0x0034, B:17:0x003e, B:30:0x00d0, B:32:0x00d6, B:34:0x00dc, B:48:0x0154, B:50:0x016f, B:52:0x0175, B:56:0x0186, B:58:0x018c, B:59:0x0191, B:61:0x0195, B:65:0x01bc, B:67:0x01c2, B:68:0x01c8, B:70:0x01d9, B:76:0x01f4, B:77:0x01f7, B:71:0x01e2, B:75:0x01ed, B:62:0x01af, B:64:0x01b7, B:47:0x0152, B:18:0x0042, B:20:0x004d, B:21:0x0076, B:23:0x0084, B:25:0x0088, B:26:0x00be, B:28:0x00c4, B:29:0x00c7, B:35:0x00f2, B:41:0x012c, B:42:0x012e, B:44:0x0134, B:46:0x013a, B:38:0x00fd, B:40:0x0103), top: B:176:0x0028 }] */
                /* JADX WARN: Removed duplicated region for block: B:58:0x018c A[Catch: all -> 0x01f9, TryCatch #3 {, blocks: (B:13:0x0028, B:15:0x0034, B:17:0x003e, B:30:0x00d0, B:32:0x00d6, B:34:0x00dc, B:48:0x0154, B:50:0x016f, B:52:0x0175, B:56:0x0186, B:58:0x018c, B:59:0x0191, B:61:0x0195, B:65:0x01bc, B:67:0x01c2, B:68:0x01c8, B:70:0x01d9, B:76:0x01f4, B:77:0x01f7, B:71:0x01e2, B:75:0x01ed, B:62:0x01af, B:64:0x01b7, B:47:0x0152, B:18:0x0042, B:20:0x004d, B:21:0x0076, B:23:0x0084, B:25:0x0088, B:26:0x00be, B:28:0x00c4, B:29:0x00c7, B:35:0x00f2, B:41:0x012c, B:42:0x012e, B:44:0x0134, B:46:0x013a, B:38:0x00fd, B:40:0x0103), top: B:176:0x0028 }] */
                /* JADX WARN: Removed duplicated region for block: B:61:0x0195 A[Catch: all -> 0x01f9, TryCatch #3 {, blocks: (B:13:0x0028, B:15:0x0034, B:17:0x003e, B:30:0x00d0, B:32:0x00d6, B:34:0x00dc, B:48:0x0154, B:50:0x016f, B:52:0x0175, B:56:0x0186, B:58:0x018c, B:59:0x0191, B:61:0x0195, B:65:0x01bc, B:67:0x01c2, B:68:0x01c8, B:70:0x01d9, B:76:0x01f4, B:77:0x01f7, B:71:0x01e2, B:75:0x01ed, B:62:0x01af, B:64:0x01b7, B:47:0x0152, B:18:0x0042, B:20:0x004d, B:21:0x0076, B:23:0x0084, B:25:0x0088, B:26:0x00be, B:28:0x00c4, B:29:0x00c7, B:35:0x00f2, B:41:0x012c, B:42:0x012e, B:44:0x0134, B:46:0x013a, B:38:0x00fd, B:40:0x0103), top: B:176:0x0028 }] */
                /* JADX WARN: Removed duplicated region for block: B:62:0x01af A[Catch: all -> 0x01f9, TryCatch #3 {, blocks: (B:13:0x0028, B:15:0x0034, B:17:0x003e, B:30:0x00d0, B:32:0x00d6, B:34:0x00dc, B:48:0x0154, B:50:0x016f, B:52:0x0175, B:56:0x0186, B:58:0x018c, B:59:0x0191, B:61:0x0195, B:65:0x01bc, B:67:0x01c2, B:68:0x01c8, B:70:0x01d9, B:76:0x01f4, B:77:0x01f7, B:71:0x01e2, B:75:0x01ed, B:62:0x01af, B:64:0x01b7, B:47:0x0152, B:18:0x0042, B:20:0x004d, B:21:0x0076, B:23:0x0084, B:25:0x0088, B:26:0x00be, B:28:0x00c4, B:29:0x00c7, B:35:0x00f2, B:41:0x012c, B:42:0x012e, B:44:0x0134, B:46:0x013a, B:38:0x00fd, B:40:0x0103), top: B:176:0x0028 }] */
                /* JADX WARN: Removed duplicated region for block: B:67:0x01c2 A[Catch: all -> 0x01f9, TryCatch #3 {, blocks: (B:13:0x0028, B:15:0x0034, B:17:0x003e, B:30:0x00d0, B:32:0x00d6, B:34:0x00dc, B:48:0x0154, B:50:0x016f, B:52:0x0175, B:56:0x0186, B:58:0x018c, B:59:0x0191, B:61:0x0195, B:65:0x01bc, B:67:0x01c2, B:68:0x01c8, B:70:0x01d9, B:76:0x01f4, B:77:0x01f7, B:71:0x01e2, B:75:0x01ed, B:62:0x01af, B:64:0x01b7, B:47:0x0152, B:18:0x0042, B:20:0x004d, B:21:0x0076, B:23:0x0084, B:25:0x0088, B:26:0x00be, B:28:0x00c4, B:29:0x00c7, B:35:0x00f2, B:41:0x012c, B:42:0x012e, B:44:0x0134, B:46:0x013a, B:38:0x00fd, B:40:0x0103), top: B:176:0x0028 }] */
                /* JADX WARN: Removed duplicated region for block: B:70:0x01d9 A[Catch: all -> 0x01f9, TryCatch #3 {, blocks: (B:13:0x0028, B:15:0x0034, B:17:0x003e, B:30:0x00d0, B:32:0x00d6, B:34:0x00dc, B:48:0x0154, B:50:0x016f, B:52:0x0175, B:56:0x0186, B:58:0x018c, B:59:0x0191, B:61:0x0195, B:65:0x01bc, B:67:0x01c2, B:68:0x01c8, B:70:0x01d9, B:76:0x01f4, B:77:0x01f7, B:71:0x01e2, B:75:0x01ed, B:62:0x01af, B:64:0x01b7, B:47:0x0152, B:18:0x0042, B:20:0x004d, B:21:0x0076, B:23:0x0084, B:25:0x0088, B:26:0x00be, B:28:0x00c4, B:29:0x00c7, B:35:0x00f2, B:41:0x012c, B:42:0x012e, B:44:0x0134, B:46:0x013a, B:38:0x00fd, B:40:0x0103), top: B:176:0x0028 }] */
                /* JADX WARN: Removed duplicated region for block: B:71:0x01e2 A[Catch: all -> 0x01f9, TryCatch #3 {, blocks: (B:13:0x0028, B:15:0x0034, B:17:0x003e, B:30:0x00d0, B:32:0x00d6, B:34:0x00dc, B:48:0x0154, B:50:0x016f, B:52:0x0175, B:56:0x0186, B:58:0x018c, B:59:0x0191, B:61:0x0195, B:65:0x01bc, B:67:0x01c2, B:68:0x01c8, B:70:0x01d9, B:76:0x01f4, B:77:0x01f7, B:71:0x01e2, B:75:0x01ed, B:62:0x01af, B:64:0x01b7, B:47:0x0152, B:18:0x0042, B:20:0x004d, B:21:0x0076, B:23:0x0084, B:25:0x0088, B:26:0x00be, B:28:0x00c4, B:29:0x00c7, B:35:0x00f2, B:41:0x012c, B:42:0x012e, B:44:0x0134, B:46:0x013a, B:38:0x00fd, B:40:0x0103), top: B:176:0x0028 }] */
                /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, uem] */
                /* JADX WARN: Type inference failed for: r4v22, types: [fzy, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r4v40, types: [java.lang.Object, ply] */
                /* JADX WARN: Type inference failed for: r4v49, types: [java.lang.Object, uem] */
                /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, ozp] */
                /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, ozo] */
                /* JADX WARN: Type inference failed for: r8v25, types: [java.lang.Object, uem] */
                /* JADX WARN: Type inference failed for: r9v40, types: [java.lang.Object, uem] */
                @Override // defpackage.sxh
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final defpackage.syu a() {
                    /*
                        Method dump skipped, instructions count: 1317
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.geg.a():syu");
                }
            }, gehVar.g.b());
            this.b = syuVarR;
            ske.W(syuVarR, new jcb(this, 1), sxo.a);
            syuVar = this.b;
        }
        return syuVar;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        c();
    }
}
