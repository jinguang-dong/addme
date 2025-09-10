package defpackage;

import android.location.Location;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.FileDescriptor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oza implements oyj {
    private final int D;
    public final ConcurrentLinkedQueue a;
    public boolean b;
    public boolean c;
    public final oyx d;
    private final boolean e;
    private pop f;
    private final Handler j;
    private final oyl l;
    private final oyl m;
    private final szh o;
    private final int r;
    private final oyg s;
    private final boolean t;
    private final rwc u;
    private final int v;
    private final ExecutorService y;
    private final long z;
    private pop g = null;
    private List h = new ArrayList();
    private volatile long k = 0;
    private List n = new CopyOnWriteArrayList();
    private final oyy p = new oyy();
    private oye q = new oye(Long.MAX_VALUE);
    private long w = 0;
    private boolean x = false;
    private final Map A = new HashMap();
    private boolean B = false;
    private final Object i = new Object();
    private int C = 1;

    public oza(FileDescriptor fileDescriptor, int i, int i2, rwc rwcVar, syu syuVar, long j, int i3, int i4, int i5, oyg oygVar, Handler handler, ExecutorService executorService, oyx oyxVar, boolean z, boolean z2) {
        this.v = i2;
        this.r = i;
        this.u = rwcVar;
        this.s = oygVar;
        this.d = oyxVar;
        this.t = z;
        this.f = v(fileDescriptor, oygVar, i, i2, rwcVar, z2);
        if (i4 != 1) {
            throw new IllegalArgumentException("add least audio or video is required.");
        }
        this.l = new oyl(i3);
        this.m = new oyl(1);
        this.n.add(new oyl(i5));
        this.D = i5;
        this.j = handler;
        this.o = new szh();
        this.a = new ConcurrentLinkedQueue();
        this.b = false;
        this.c = false;
        this.y = executorService;
        this.z = (-30000000) + j;
        this.e = z2;
        mdv mdvVar = new mdv(9);
        sxo sxoVar = sxo.a;
        ske.W(swz.i(syuVar, mdvVar, sxoVar), new fxw(this, 15), sxoVar);
    }

    private final synchronized oye r() {
        return this.q;
    }

    private final void s() {
        synchronized (this.i) {
            a.I(this.x);
            pop popVar = this.f;
            pop popVar2 = this.g;
            popVar2.getClass();
            this.f = popVar2;
            this.g = null;
            this.n = ujp.aB(this.h);
            this.h = new ArrayList();
            this.f.g();
            this.x = false;
            this.B = false;
            ((sww) this.y).submit(new nzq(this, popVar, 19, (byte[]) null));
            this.j.post(new ooc(this, 16));
        }
    }

    private final void t(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i) {
        oye oyeVarR = r();
        Object obj = this.i;
        synchronized (obj) {
            int i2 = this.C;
            if (i2 != 2) {
                Log.e("MediaMuxerMul", "STARTED is expected, but we get " + prh.S(i2));
                return;
            }
            if (this.t) {
                synchronized (obj) {
                    if (this.w >= this.z) {
                        this.j.post(new ooc(this, 20));
                        this.w = 0L;
                    }
                    if (this.x) {
                        oyl oylVar = this.m;
                        if (oylVar.d()) {
                            s();
                        } else if (i == oylVar.a() && (bufferInfo.flags & 1) != 0) {
                            long j = bufferInfo.presentationTimeUs;
                            s();
                        }
                    }
                }
            }
            if (bufferInfo.presentationTimeUs < 0) {
                Log.e("MediaMuxerMul", "Tried to write negative presentationTimeUs " + bufferInfo.presentationTimeUs);
                return;
            }
            try {
                this.f.i(i, byteBuffer, bufferInfo);
                this.p.a += bufferInfo.size;
                this.w += bufferInfo.size;
            } catch (IllegalArgumentException | IllegalStateException e) {
                Log.e("MediaMuxerMul", "Fail to write data to muxer", e);
                this.j.post(new ooc(this, 17));
            }
            oyy oyyVar = this.p;
            if (oyyVar.a >= oyeVarR.a) {
                this.j.post(new ooc(this, 18));
            }
            long j2 = oyyVar.b;
            long j3 = oyeVarR.b;
            if (j2 >= Long.MAX_VALUE) {
                this.j.post(new ooc(this, 19));
            }
        }
    }

    private final boolean u() {
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            if (!((oyl) it.next()).e()) {
                return false;
            }
        }
        return true;
    }

    private static pop v(FileDescriptor fileDescriptor, oyg oygVar, int i, int i2, rwc rwcVar, boolean z) {
        if (fileDescriptor == null) {
            throw new IllegalArgumentException("Either outputFilePath or outputFilePath should be provided.");
        }
        pop popVarA = oygVar.a(fileDescriptor, i);
        if (popVarA.l()) {
            popVarA.b("com.android.manufacturer", z ? Build.MANUFACTURER : "Google");
            popVarA.b("com.android.model", z ? Build.MODEL : "Pixel");
        }
        popVarA.e(i2);
        if (i == 0 && rwcVar.h()) {
            popVarA.d((float) ((Location) rwcVar.c()).getLatitude(), (float) ((Location) rwcVar.c()).getLongitude());
        }
        return popVarA;
    }

    public final synchronized void a(oye oyeVar) {
        this.q = oyeVar;
    }

    @Override // defpackage.oyj
    public final void c(MediaFormat mediaFormat) {
        synchronized (this.i) {
            int i = this.C;
            if (i != 3 && i != 4) {
                if (i == 2 && !this.f.k()) {
                    Log.e("MediaMuxerMul", "Already started, cannot add audio track.");
                    return;
                }
                oyl oylVar = this.l;
                if (oylVar.d()) {
                    Log.e("MediaMuxerMul", "Audio track is forbidden and can't be added");
                    return;
                }
                oylVar.c(this.f.a(mediaFormat));
                oylVar.d = mediaFormat;
                oylVar.a();
                return;
            }
            Log.e("MediaMuxerMul", "Already stopped or closed, cannot add audio track.");
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        j();
        this.y.shutdown();
    }

    @Override // defpackage.oyj
    public final void d(oyk oykVar) {
        this.a.add(oykVar);
    }

    @Override // defpackage.oyj
    public final void f(MediaFormat mediaFormat) {
        synchronized (this.i) {
            int i = this.C;
            if (i != 3 && i != 4) {
                if (i == 2 && !this.f.k()) {
                    Log.e("MediaMuxerMul", "Already started, cannot add video track.");
                    return;
                }
                oyl oylVar = this.m;
                oylVar.c(this.f.a(mediaFormat));
                oylVar.d = mediaFormat;
                oylVar.a();
                return;
            }
            Log.e("MediaMuxerMul", "Already stopped or closed, cannot add video track.");
        }
    }

    @Override // defpackage.oyj
    public final void g() {
        synchronized (this.i) {
            if (this.C != 1) {
                Log.e("MediaMuxerMul", "Already started, cannot discard track.");
                return;
            }
            oyl oylVar = this.l;
            if (oylVar.a) {
                Log.w("TrackInf", "Track is already added");
            } else {
                oylVar.b = true;
            }
        }
    }

    @Override // defpackage.oyj
    public final void h(oyk oykVar) {
        this.a.remove(oykVar);
    }

    @Override // defpackage.oyj
    public final void i(FileDescriptor fileDescriptor) {
        try {
            this.g = v(fileDescriptor, this.s, this.r, this.v, this.u, this.e);
            ArrayList arrayList = new ArrayList();
            oyl oylVar = this.m;
            if (oylVar.a) {
                arrayList.add(oylVar);
            }
            oyl oylVar2 = this.l;
            if (oylVar2.a) {
                arrayList.add(oylVar2);
            }
            for (oyl oylVar3 : this.n) {
                if (oylVar3.a) {
                    arrayList.add(oylVar3);
                }
            }
            this.h = ujp.aB(this.n);
            Collections.sort(arrayList);
            int size = arrayList.size();
            int i = 0;
            while (true) {
                boolean z = true;
                if (i >= size) {
                    break;
                }
                oyl oylVar4 = (oyl) arrayList.get(i);
                pop popVar = this.g;
                popVar.getClass();
                MediaFormat mediaFormat = oylVar4.d;
                mediaFormat.getClass();
                if (popVar.a(mediaFormat) != oylVar4.a()) {
                    z = false;
                }
                a.I(z);
                i++;
            }
            for (Map.Entry entry : this.A.entrySet()) {
                pop popVar2 = this.g;
                popVar2.getClass();
                popVar2.b((String) entry.getKey(), entry.getValue());
            }
            this.x = true;
        } catch (oyf e) {
            Log.e("MediaMuxerMul", "Fail to create next video file", e);
            throw new IllegalStateException("Fail to create next video file", e);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:45|4|(7:6|(1:8)|9|(2:11|(2:15|(1:17)(2:18|(1:20)(1:21))))|47|22|26)(5:(0)(3:34|(1:36)|37)|39|40|41|42)|43|29|33|34|(0)|37) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
    
        android.util.Log.e("MediaMuxerMul", "Failed to release mediamuxer " + r0.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3 A[Catch: all -> 0x00ab, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x000b, B:8:0x0013, B:9:0x0020, B:11:0x0026, B:13:0x002c, B:15:0x0030, B:17:0x0053, B:18:0x0057, B:20:0x005b, B:21:0x005f, B:22:0x0066, B:26:0x007b, B:29:0x0081, B:33:0x009d, B:34:0x009f, B:36:0x00a3, B:37:0x00a9, B:32:0x0088, B:25:0x006d), top: B:45:0x0005, inners: #0, #2 }] */
    @Override // defpackage.oyj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            r13 = this;
            java.lang.String r1 = "Failed to release mediamuxer "
            java.lang.Object r2 = r13.i
            monitor-enter(r2)
            int r0 = r13.C     // Catch: java.lang.Throwable -> Lab
            r3 = 2
            r4 = 4
            if (r0 != r3) goto L7f
            pop r0 = r13.f     // Catch: java.lang.Throwable -> Lab
            boolean r0 = r0.l()     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L20
            pop r0 = r13.f     // Catch: java.lang.Throwable -> Lab
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lab
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lab
            r0.f(r5, r7)     // Catch: java.lang.Throwable -> Lab
        L20:
            oyl r0 = r13.m     // Catch: java.lang.Throwable -> Lab
            boolean r3 = r0.c     // Catch: java.lang.Throwable -> Lab
            if (r3 == 0) goto L66
            oyl r3 = r13.l     // Catch: java.lang.Throwable -> Lab
            boolean r5 = r3.a     // Catch: java.lang.Throwable -> Lab
            if (r5 == 0) goto L30
            boolean r5 = r3.c     // Catch: java.lang.Throwable -> Lab
            if (r5 == 0) goto L66
        L30:
            java.lang.String r5 = "MediaMuxerMul"
            java.lang.String r6 = "All tracks empty; writing empty packet to avoid muxer hang"
            android.util.Log.e(r5, r6)     // Catch: java.lang.Throwable -> Lab
            r5 = 1
            r13.B = r5     // Catch: java.lang.Throwable -> Lab
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r5)     // Catch: java.lang.Throwable -> Lab
            r6 = 0
            r5.put(r6)     // Catch: java.lang.Throwable -> Lab
            android.media.MediaCodec$BufferInfo r7 = new android.media.MediaCodec$BufferInfo     // Catch: java.lang.Throwable -> Lab
            r7.<init>()     // Catch: java.lang.Throwable -> Lab
            long r10 = r13.k     // Catch: java.lang.Throwable -> Lab
            r12 = 5
            r8 = 0
            r9 = 1
            r7.set(r8, r9, r10, r12)     // Catch: java.lang.Throwable -> Lab
            boolean r0 = r0.a     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L57
            r13.o(r5, r7)     // Catch: java.lang.Throwable -> Lab
            goto L66
        L57:
            boolean r0 = r3.a     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L5f
            r13.m(r5, r7)     // Catch: java.lang.Throwable -> Lab
            goto L66
        L5f:
            java.lang.String r0 = "MediaMuxerMul"
            java.lang.String r3 = "Couldn't write out any empty packets."
            android.util.Log.e(r0, r3)     // Catch: java.lang.Throwable -> Lab
        L66:
            pop r0 = r13.f     // Catch: java.lang.IllegalStateException -> L6c java.lang.Throwable -> Lab
            r0.h()     // Catch: java.lang.IllegalStateException -> L6c java.lang.Throwable -> Lab
            goto L7b
        L6c:
            r0 = move-exception
            java.lang.String r3 = "MediaMuxerMul"
            java.lang.String r5 = "Failed to stop mediamuxer "
            android.util.Log.e(r3, r5, r0)     // Catch: java.lang.Throwable -> Lab
            oyx r0 = r13.d     // Catch: java.lang.Throwable -> Lab
            oyu r3 = defpackage.oyu.MUXER_STOP_ERROR     // Catch: java.lang.Throwable -> Lab
            r0.a(r3)     // Catch: java.lang.Throwable -> Lab
        L7b:
            r0 = 3
            r13.C = r0     // Catch: java.lang.Throwable -> Lab
            goto L81
        L7f:
            if (r0 == r4) goto L9f
        L81:
            pop r0 = r13.f     // Catch: java.lang.IllegalStateException -> L87 java.lang.Throwable -> Lab
            r0.c()     // Catch: java.lang.IllegalStateException -> L87 java.lang.Throwable -> Lab
            goto L9d
        L87:
            r0 = move-exception
            java.lang.String r3 = "MediaMuxerMul"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lab
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lab
            r5.<init>(r1)     // Catch: java.lang.Throwable -> Lab
            r5.append(r0)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> Lab
            android.util.Log.e(r3, r0)     // Catch: java.lang.Throwable -> Lab
        L9d:
            r13.C = r4     // Catch: java.lang.Throwable -> Lab
        L9f:
            pop r0 = r13.g     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto La9
            r0.c()     // Catch: java.lang.Throwable -> Lab
            r0 = 0
            r13.g = r0     // Catch: java.lang.Throwable -> Lab
        La9:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lab
            return
        Lab:
            r0 = move-exception
            r13 = r0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lab
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oza.j():void");
    }

    @Override // defpackage.oyj
    public final void k(long j) {
        try {
            this.o.t(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException("Wait for Muxer start is interrupted", e);
        } catch (TimeoutException e2) {
            throw new RuntimeException(String.format("Wait for muxer to start timed out after %s milliseconds.audio-ready: %s, video-ready: %s, meta-ready: %s", Long.valueOf(j), Boolean.valueOf(this.l.e()), Boolean.valueOf(this.m.e()), Boolean.valueOf(u())), e2);
        }
    }

    @Override // defpackage.oyj
    public final void l() {
        synchronized (this.i) {
            int i = this.C;
            if (i == 1) {
                if ((this.l.e() && this.m.e() && u()) || this.f.k()) {
                    this.f.g();
                    this.C = 2;
                    this.o.e(null);
                    this.k = TimeUnit.MILLISECONDS.toMicros(SystemClock.uptimeMillis());
                }
            } else if (i == 3) {
                Log.e("MediaMuxerMul", "Muxer is already stopped and it cannot be reused");
            }
        }
    }

    @Override // defpackage.oyj
    public final void m(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        oyl oylVar = this.l;
        if (!oylVar.a) {
            Log.e("MediaMuxerMul", "Audio track is not supported");
            return;
        }
        t(byteBuffer, bufferInfo, oylVar.a());
        if (bufferInfo.size > 0) {
            oylVar.b();
        }
    }

    @Override // defpackage.oyj
    public final void n(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i) {
        oyl oylVar;
        Iterator it = this.n.iterator();
        while (true) {
            if (!it.hasNext()) {
                oylVar = null;
                break;
            }
            oylVar = (oyl) it.next();
            if (oylVar.a && oylVar.a() == i) {
                break;
            }
        }
        if (oylVar == null) {
            Log.e("MediaMuxerMul", a.bv(i, "Couldn't find metadata track: "));
            return;
        }
        if (!oylVar.a) {
            Log.e("MediaMuxerMul", "Metadata track is not supported");
            return;
        }
        t(byteBuffer, bufferInfo, oylVar.a());
        if (bufferInfo.size > 0) {
            oylVar.b();
        }
    }

    @Override // defpackage.oyj
    public final void o(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        oyl oylVar = this.m;
        if (!oylVar.a) {
            Log.e("MediaMuxerMul", "Video track is not supported");
            return;
        }
        t(byteBuffer, bufferInfo, oylVar.a());
        if (bufferInfo.size > 0) {
            oylVar.b();
            if (this.B) {
                return;
            }
            this.j.post(new nzq(this, bufferInfo, 20));
        }
    }

    @Override // defpackage.oyj
    public final boolean p() {
        boolean z;
        synchronized (this.i) {
            z = this.C == 2;
        }
        return z;
    }

    @Override // defpackage.oyj
    public final void q(Object obj) {
        synchronized (this.i) {
            int i = this.C;
            if (i != 3 && i != 4) {
                this.A.put("SpecialTypeID", obj);
                this.f.b("SpecialTypeID", obj);
                return;
            }
            Log.e("MediaMuxerMul", "Failed to add metadata with state: " + prh.S(i));
        }
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    @Override // defpackage.oyj
    public final defpackage.rwc b(android.media.MediaFormat r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.i
            monitor-enter(r0)
            java.lang.String r1 = "mime"
            r8.getString(r1)     // Catch: java.lang.Throwable -> Lca
            int r1 = r7.C     // Catch: java.lang.Throwable -> Lca
            r2 = 3
            if (r1 == r2) goto Lbf
            r3 = 4
            if (r1 != r3) goto L12
            goto Lbf
        L12:
            r3 = 2
            if (r1 != r3) goto L29
            pop r1 = r7.f     // Catch: java.lang.Throwable -> Lca
            boolean r1 = r1.k()     // Catch: java.lang.Throwable -> Lca
            if (r1 != 0) goto L29
            r7 = 0
            java.lang.String r7 = com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU.myPejedoeuvn     // Catch: java.lang.Throwable -> Lca
            java.lang.String r8 = "Already started, cannot add metadata track."
            android.util.Log.e(r7, r8)     // Catch: java.lang.Throwable -> Lca
            rvk r7 = defpackage.rvk.a     // Catch: java.lang.Throwable -> Lca
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lca
            return r7
        L29:
            int r1 = r7.D     // Catch: java.lang.Throwable -> Lca
            if (r1 != r2) goto L38
            java.lang.String r7 = "MediaMuxerMul"
            java.lang.String r8 = "Metadata track is forbidden and can't be added"
            android.util.Log.e(r7, r8)     // Catch: java.lang.Throwable -> Lca
            rvk r7 = defpackage.rvk.a     // Catch: java.lang.Throwable -> Lca
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lca
            return r7
        L38:
            java.lang.String r1 = "mime"
            java.lang.String r1 = r8.getString(r1)     // Catch: java.lang.Throwable -> Lca
            r1.getClass()     // Catch: java.lang.Throwable -> Lca
            java.util.List r2 = r7.n     // Catch: java.lang.Throwable -> Lca
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lca
        L47:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> Lca
            if (r4 == 0) goto L7e
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> Lca
            oyl r4 = (defpackage.oyl) r4     // Catch: java.lang.Throwable -> Lca
            android.media.MediaFormat r5 = r4.d     // Catch: java.lang.Throwable -> Lca
            if (r5 == 0) goto L47
            java.lang.String r6 = "mime"
            java.lang.String r5 = r5.getString(r6)     // Catch: java.lang.Throwable -> Lca
            boolean r5 = r1.equals(r5)     // Catch: java.lang.Throwable -> Lca
            if (r5 == 0) goto L47
            java.lang.String r7 = "MediaMuxerMul"
            java.lang.String r8 = "Metadata track format "
            java.lang.String r2 = " already added."
            java.lang.String r8 = defpackage.a.bw(r1, r8, r2)     // Catch: java.lang.Throwable -> Lca
            android.util.Log.w(r7, r8)     // Catch: java.lang.Throwable -> Lca
            int r7 = r4.a()     // Catch: java.lang.Throwable -> Lca
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Lca
            rwc r7 = defpackage.rwc.j(r7)     // Catch: java.lang.Throwable -> Lca
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lca
            return r7
        L7e:
            java.util.List r1 = r7.n     // Catch: java.lang.Throwable -> Lca
            java.lang.Object r1 = defpackage.ujp.aQ(r1)     // Catch: java.lang.Throwable -> Lca
            oyl r1 = (defpackage.oyl) r1     // Catch: java.lang.Throwable -> Lca
            boolean r1 = r1.a     // Catch: java.lang.Throwable -> Lca
            if (r1 != 0) goto L99
            java.util.List r1 = r7.n     // Catch: java.lang.Throwable -> Lca
            int r2 = r1.size()     // Catch: java.lang.Throwable -> Lca
            int r2 = r2 + (-1)
            java.lang.Object r1 = r1.remove(r2)     // Catch: java.lang.Throwable -> Lca
            oyl r1 = (defpackage.oyl) r1     // Catch: java.lang.Throwable -> Lca
            goto L9e
        L99:
            oyl r1 = new oyl     // Catch: java.lang.Throwable -> Lca
            r1.<init>(r3)     // Catch: java.lang.Throwable -> Lca
        L9e:
            pop r2 = r7.f     // Catch: java.lang.Throwable -> Lca
            int r2 = r2.a(r8)     // Catch: java.lang.Throwable -> Lca
            r1.c(r2)     // Catch: java.lang.Throwable -> Lca
            r1.d = r8     // Catch: java.lang.Throwable -> Lca
            java.util.List r7 = r7.n     // Catch: java.lang.Throwable -> Lca
            r7.add(r1)     // Catch: java.lang.Throwable -> Lca
            r1.a()     // Catch: java.lang.Throwable -> Lca
            int r7 = r1.a()     // Catch: java.lang.Throwable -> Lca
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Lca
            rwc r7 = defpackage.rwc.j(r7)     // Catch: java.lang.Throwable -> Lca
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lca
            return r7
        Lbf:
            java.lang.String r7 = "MediaMuxerMul"
            java.lang.String r8 = "Already stopped or closed, cannot add metadata track."
            android.util.Log.e(r7, r8)     // Catch: java.lang.Throwable -> Lca
            rvk r7 = defpackage.rvk.a     // Catch: java.lang.Throwable -> Lca
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lca
            return r7
        Lca:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lca
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oza.b(android.media.MediaFormat):rwc");
    }

    @Override // defpackage.oyj
    public final void e(long j) {
        if (j < 0) {
            Log.e("MediaMuxerMul", VnmwoBe.fQt);
        } else {
            this.p.b += j;
        }
    }
}
