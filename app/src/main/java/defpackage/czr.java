package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class czr {
    public final FileChannel a;
    public final czo b;
    public final int c;
    public final boolean d;
    public boolean h;
    private final czl j;
    private long k;
    private long l;
    private long m;
    private long n;
    private long o;
    public final List e = new ArrayList();
    public final List f = new ArrayList();
    public final AtomicBoolean g = new AtomicBoolean(false);
    private seo p = seo.e(0L, 0L);
    public long i = 0;
    private final scf q = new scf((char[]) null, (byte[]) null, (byte[]) null);

    public czr(FileChannel fileChannel, czo czoVar, czl czlVar, int i, boolean z, boolean z2) {
        this.a = fileChannel;
        this.b = czoVar;
        this.j = czlVar;
        this.c = i;
        this.d = z;
        this.h = z2;
    }

    private final ByteBuffer e() {
        return czm.g(this.e, this.b, this.c);
    }

    private final void f(long j) throws IOException {
        if (this.h) {
            return;
        }
        long j2 = this.o;
        if (j2 + j >= this.n) {
            g(Math.max(this.n + Math.min(1000000000L, Math.max(500000L, (long) (j2 * 0.2f))) + j, ((Long) this.p.i()).longValue()), e());
        }
    }

    private final void g(long j, ByteBuffer byteBuffer) throws IOException {
        coi.x(j >= ((Long) this.p.i()).longValue());
        coi.x(j >= this.n);
        FileChannel fileChannel = this.a;
        fileChannel.position(j);
        fileChannel.write(com.n("free", byteBuffer.duplicate()));
        long j2 = 8 + j;
        this.n = j2;
        h(j2 - this.m);
        this.p = seo.e(Long.valueOf(j), Long.valueOf(j + byteBuffer.remaining()));
    }

    private final void h(long j) throws IOException {
        long j2 = this.m + 8;
        FileChannel fileChannel = this.a;
        fileChannel.position(j2);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(j);
        byteBufferAllocate.flip();
        fileChannel.write(byteBufferAllocate);
    }

    public final void a() {
        if (this.h) {
            b();
            return;
        }
        ByteBuffer byteBufferE = e();
        int iRemaining = byteBufferE.remaining();
        long j = iRemaining + 8;
        if (this.n - this.o < j) {
            g(((Long) this.p.i()).longValue() + j, byteBufferE);
            coi.x(this.n - this.o >= j);
        }
        long j2 = this.o;
        FileChannel fileChannel = this.a;
        fileChannel.position(j2);
        fileChannel.write(byteBufferE);
        long j3 = iRemaining + j2;
        long jLongValue = ((Long) this.p.i()).longValue() - j3;
        coi.x(jLongValue < 2147483647L);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt((int) jLongValue);
        byteBufferAllocate.put(cza.d("free"));
        byteBufferAllocate.flip();
        fileChannel.write(byteBufferAllocate);
        this.n = j2;
        h(j2 - this.m);
        this.p = seo.e(Long.valueOf(j2), Long.valueOf(j2 + byteBufferE.limit()));
        fileChannel.truncate(j3);
    }

    public final void b() throws IOException {
        ByteBuffer byteBufferE = e();
        int iRemaining = byteBufferE.remaining();
        int iRemaining2 = byteBufferE.remaining() + 8;
        long j = this.l;
        long j2 = this.k;
        if (iRemaining2 <= j - j2) {
            FileChannel fileChannel = this.a;
            fileChannel.position(j2);
            fileChannel.write(byteBufferE);
            fileChannel.write(com.n("free", ByteBuffer.allocate((int) ((this.l - fileChannel.position()) - 8))));
        } else {
            this.h = false;
            long j3 = this.o;
            this.n = j3;
            FileChannel fileChannel2 = this.a;
            fileChannel2.position(j3);
            fileChannel2.write(byteBufferE);
            this.p = seo.e(Long.valueOf(this.n), Long.valueOf(this.n + iRemaining));
            fileChannel2.write(com.n("free", ByteBuffer.allocate((int) ((this.l - this.k) - 8))), this.k);
        }
        h(this.o - this.m);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.czt r13) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czr.c(czt):void");
    }

    public final boolean d(List list) {
        boolean z = false;
        for (int i = 0; i < list.size(); i++) {
            czt cztVar = (czt) list.get(i);
            Deque deque = cztVar.g;
            if (deque.size() > 2) {
                czn cznVar = (czn) deque.peekFirst();
                coi.z(cznVar);
                czn cznVar2 = (czn) deque.peekLast();
                coi.z(cznVar2);
                if (cznVar2.a - cznVar.a > 1000000) {
                    c(cztVar);
                    z = true;
                }
            }
        }
        return z;
    }
}
