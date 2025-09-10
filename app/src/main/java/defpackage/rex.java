package defpackage;

import android.content.BroadcastReceiver;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rex extends uht implements uiu {
    Object a;
    Object b;
    int c;
    final /* synthetic */ rey d;
    final /* synthetic */ View e;
    final /* synthetic */ BroadcastReceiver.PendingResult f;
    final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rex(rey reyVar, View view, BroadcastReceiver.PendingResult pendingResult, long j, uhb uhbVar) {
        super(2, uhbVar);
        this.d = reyVar;
        this.e = view;
        this.f = pendingResult;
        this.g = j;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((rex) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (defpackage.ung.s(r13, r5, r12) != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
    
        if (defpackage.ung.s(r2, r3, r12) != r1) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.Closeable] */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r13) {
        /*
            r12 = this;
            uhi r1 = defpackage.uhi.a
            int r0 = r12.c
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L25
            if (r0 == r3) goto L1a
            if (r0 == r2) goto L12
            defpackage.rnt.aN(r13)
            goto L9d
        L12:
            defpackage.rnt.aN(r13)     // Catch: java.lang.Throwable -> L17
            goto L9d
        L17:
            r0 = move-exception
            r13 = r0
            goto L7d
        L1a:
            java.lang.Object r3 = r12.b
            java.lang.Object r0 = r12.a
            defpackage.rnt.aN(r13)     // Catch: java.lang.Throwable -> L22
            goto L4b
        L22:
            r0 = move-exception
        L23:
            r13 = r0
            goto L77
        L25:
            defpackage.rnt.aN(r13)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L17
            r0.<init>()     // Catch: java.lang.Throwable -> L17
            java.util.zip.GZIPOutputStream r13 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L17
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L17
            rey r5 = r12.d     // Catch: java.lang.Throwable -> L17
            android.view.View r6 = r12.e     // Catch: java.lang.Throwable -> L17
            rfc r5 = r5.b     // Catch: java.lang.Throwable -> L74
            r12.a = r0     // Catch: java.lang.Throwable -> L74
            r12.b = r13     // Catch: java.lang.Throwable -> L74
            r12.c = r3     // Catch: java.lang.Throwable -> L74
            upw r3 = defpackage.rfc.b     // Catch: java.lang.Throwable -> L74
            java.lang.Object r3 = r5.b(r6, r13, r3, r12)     // Catch: java.lang.Throwable -> L74
            if (r3 == r1) goto L48
            ufg r3 = defpackage.ufg.a     // Catch: java.lang.Throwable -> L74
        L48:
            if (r3 == r1) goto L9c
            r3 = r13
        L4b:
            defpackage.ujk.e(r3, r4)     // Catch: java.lang.Throwable -> L17
            java.io.ByteArrayOutputStream r0 = (java.io.ByteArrayOutputStream) r0     // Catch: java.lang.Throwable -> L17
            byte[] r13 = r0.toByteArray()     // Catch: java.lang.Throwable -> L17
            r0 = 0
            java.lang.String r7 = android.util.Base64.encodeToString(r13, r0)     // Catch: java.lang.Throwable -> L17
            upw r13 = defpackage.rfc.b     // Catch: java.lang.Throwable -> L17
            rew r5 = new rew     // Catch: java.lang.Throwable -> L17
            android.content.BroadcastReceiver$PendingResult r6 = r12.f     // Catch: java.lang.Throwable -> L17
            rey r8 = r12.d     // Catch: java.lang.Throwable -> L17
            long r9 = r12.g     // Catch: java.lang.Throwable -> L17
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r11)     // Catch: java.lang.Throwable -> L17
            r12.a = r4     // Catch: java.lang.Throwable -> L17
            r12.b = r4     // Catch: java.lang.Throwable -> L17
            r12.c = r2     // Catch: java.lang.Throwable -> L17
            java.lang.Object r12 = defpackage.ung.s(r13, r5, r12)     // Catch: java.lang.Throwable -> L17
            if (r12 != r1) goto L9d
            goto L9c
        L74:
            r0 = move-exception
            r3 = r13
            goto L23
        L77:
            throw r13     // Catch: java.lang.Throwable -> L78
        L78:
            r0 = move-exception
            defpackage.ujk.e(r3, r13)     // Catch: java.lang.Throwable -> L17
            throw r0     // Catch: java.lang.Throwable -> L17
        L7d:
            java.lang.String r0 = defpackage.rey.a
            java.lang.String r2 = "Failed to snapshot hierarchy"
            android.util.Log.e(r0, r2, r13)
            rey r13 = r12.d
            android.content.BroadcastReceiver$PendingResult r0 = r12.f
            upw r2 = defpackage.rfc.b
            sw r3 = new sw
            r5 = 3
            r3.<init>(r13, r0, r4, r5)
            r12.a = r4
            r12.b = r4
            r12.c = r5
            java.lang.Object r12 = defpackage.ung.s(r2, r3, r12)
            if (r12 != r1) goto L9d
        L9c:
            return r1
        L9d:
            ufg r12 = defpackage.ufg.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rex.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new rex(this.d, this.e, this.f, this.g, uhbVar);
    }
}
