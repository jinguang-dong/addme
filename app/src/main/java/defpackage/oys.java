package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.NoiseSuppressor;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;
import com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oys implements paq {
    public final HandlerThread D;
    private final owq H;
    private final pbn I;
    private final oyt J;
    private final owq L;
    private paq M;
    private paq N;
    private AcousticEchoCanceler O;
    private NoiseSuppressor P;
    private final Handler Q;
    private final MediaCodec.Callback R;
    private int S;
    public final syw a;
    public final syw b;
    public final syw c;
    public final syw d;
    public final plx g;
    public final MediaCodec h;
    public final sbp i;
    public final double j;
    public final sbp k;
    public final boolean m;
    public long q;
    private final Object F = new Object();
    public final Object e = new Object();
    public final Object f = new Object();
    private final Object G = new Object();
    public final Queue l = new ArrayDeque(1000);
    public final Deque n = new ArrayDeque();
    public long o = -1;
    public volatile long p = Long.MAX_VALUE;
    private long K = 0;
    public final AtomicLong r = new AtomicLong(0);
    public final AtomicLong s = new AtomicLong(0);
    public volatile boolean t = false;
    public volatile boolean u = false;
    public volatile boolean v = false;
    public volatile boolean w = false;
    public volatile boolean x = false;
    public final AtomicBoolean y = new AtomicBoolean(false);
    public Future z = null;
    public long A = -1;
    public int B = -1;
    public byte[] C = null;
    public final szh E = new szh();

    private static long j() {
        return TimeUnit.MICROSECONDS.convert(SystemClock.uptimeMillis(), TimeUnit.MILLISECONDS);
    }

    private final void k() {
        this.Q.post(new ooc(this, 12));
        try {
            this.D.join();
        } catch (InterruptedException unused) {
        }
    }

    private final void l(long j) {
        synchronized (this.f) {
            Deque deque = this.n;
            seo seoVar = (seo) deque.removeLast();
            deque.add(seo.e((Long) seoVar.h(), Long.valueOf(j)));
            this.q += j - ((Long) seoVar.h()).longValue();
        }
    }

    public final long a(long j) {
        return (long) (j * this.j);
    }

    public final void b(long j) {
        synchronized (this.F) {
            if (this.S != 2) {
                Log.e("AudioEncoder", "It is not recording now");
                return;
            }
            this.S = 5;
            this.n.add(seo.c(Long.valueOf(a(j))));
        }
    }

    public final void c() {
        synchronized (this.F) {
            if (this.S != 4) {
                if (this.D.isAlive()) {
                    k();
                }
                this.a.shutdown();
                this.c.shutdown();
                this.b.shutdown();
                this.d.shutdown();
                this.h.release();
                this.g.close();
                paq paqVar = this.M;
                if (paqVar != null) {
                    paqVar.close();
                }
                paq paqVar2 = this.N;
                if (paqVar2 != null) {
                    paqVar2.close();
                }
                this.S = 4;
                SystemClock.uptimeMillis();
            }
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.F) {
            g(j());
            c();
        }
    }

    public final void d(long j) {
        synchronized (this.F) {
            if (this.S != 5) {
                Log.e("AudioEncoder", "It is not recording now");
            } else {
                this.S = 2;
                l(a(j));
            }
        }
    }

    public final void e(Runnable runnable, syw sywVar) {
        ske.W(sywVar.submit(runnable), new oyq(this, 0), sxo.a);
    }

    public final void g(long j) {
        synchronized (this.F) {
            int i = this.S;
            if (i != 2) {
                if (i == 5) {
                    i = 5;
                }
            }
            long jA = a(j);
            if (i == 5) {
                l(jA);
            }
            this.p = jA - this.q;
            this.I.f("AudioEncoder#stop");
            this.J.a(1, this.p, this.r, this.E);
            this.g.f();
            synchronized (this.G) {
                AcousticEchoCanceler acousticEchoCanceler = this.O;
                if (acousticEchoCanceler != null) {
                    acousticEchoCanceler.setEnabled(false);
                    this.O.release();
                    this.O = null;
                }
                NoiseSuppressor noiseSuppressor = this.P;
                if (noiseSuppressor != null) {
                    noiseSuppressor.setEnabled(false);
                    this.P.release();
                    this.P = null;
                }
            }
            this.Q.post(new ooc(this, 13));
            k();
            this.I.g();
            this.S = 3;
        }
    }

    public final void h() {
        this.t = true;
        synchronized (this.F) {
            int i = this.S;
            if (i == 2 || i == 5) {
                if (this.v) {
                    this.c.submit(new dyo(this, 19));
                }
                g(j());
            }
        }
    }

    public final void i() {
        while (true) {
            Queue queue = this.l;
            if (queue.isEmpty() || ((oyr) queue.peek()).a.presentationTimeUs > ((Long) ((ovx) this.L).d).longValue()) {
                return;
            }
            oyr oyrVar = (oyr) queue.poll();
            MediaCodec.BufferInfo bufferInfo = oyrVar.a;
            if (bufferInfo.presentationTimeUs >= ((Long) ((ovx) this.H).d).longValue() && this.K < bufferInfo.presentationTimeUs) {
                ByteBuffer byteBuffer = oyrVar.b;
                sbp sbpVar = this.i;
                int size = sbpVar.size();
                for (int i = 0; i < size; i++) {
                    oyj oyjVar = (oyj) sbpVar.get(i);
                    if (!oyjVar.p()) {
                        try {
                            oyjVar.k(2000L);
                        } catch (RuntimeException e) {
                            Log.e("AudioEncoder", "Could not start all required tracks.", e);
                            this.w = true;
                            sbp sbpVar2 = this.k;
                            int size2 = sbpVar2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                ((oyx) sbpVar2.get(i2)).a(oyu.VIDEO_TRACK_FAIL_TO_START);
                            }
                        }
                    }
                    oyjVar.m(byteBuffer, bufferInfo);
                }
                this.v = true;
                this.u = true;
                this.K = oyrVar.a.presentationTimeUs;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        synchronized (this.F) {
            int i = this.S;
            if (i != 1) {
                Log.e("AudioEncoder", mn.g(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? oUZhwRhE.kzjubkvWDoql : "PAUSED" : "CLOSED" : "STOPPED" : "STARTED" : "READY", "illegal state as "));
                return;
            }
            if (this.x) {
                close();
                sgk it = this.k.iterator();
                while (it.hasNext()) {
                    ((oyx) it.next()).a(oyu.MEDIA_CODEC_ERROR_AUDIO);
                }
                return;
            }
            this.q = 0L;
            owq owqVar = this.H;
            nta ntaVar = new nta(this, 13);
            syw sywVar = this.c;
            this.M = owqVar.dK(ntaVar, sywVar);
            this.N = this.L.dK(new nta(this, 14), sywVar);
            plx plxVar = this.g;
            if (plxVar.b() == 7) {
                int iA = plxVar.a();
                synchronized (this.G) {
                    if (AcousticEchoCanceler.isAvailable()) {
                        if (this.O == null) {
                            pbn pbnVar = this.I;
                            pbnVar.f("AudioEncoder#createAcousticEchoCanceler");
                            this.O = AcousticEchoCanceler.create(iA);
                            pbnVar.g();
                        }
                        AcousticEchoCanceler acousticEchoCanceler = this.O;
                        acousticEchoCanceler.getClass();
                        acousticEchoCanceler.setEnabled(true);
                    } else {
                        Log.w("AudioEncoder", "AcousticEchoCanceler is unavailable.");
                    }
                    if (NoiseSuppressor.isAvailable()) {
                        if (this.P == null) {
                            pbn pbnVar2 = this.I;
                            pbnVar2.f("AudioEncoder#createNoiseSuppressor");
                            this.P = NoiseSuppressor.create(iA);
                            pbnVar2.g();
                        }
                        NoiseSuppressor noiseSuppressor = this.P;
                        noiseSuppressor.getClass();
                        noiseSuppressor.setEnabled(false);
                    } else {
                        Log.w("AudioEncoder", "NoiseSuppressor is unavailable.");
                    }
                }
            }
            plx plxVar2 = this.g;
            plxVar2.e();
            String.valueOf(plxVar2.getRoutedDevice());
            plxVar2.c();
            if (plxVar2.c() == 3) {
                this.S = 2;
                this.h.start();
                return;
            }
            sgk it2 = this.i.iterator();
            while (it2.hasNext()) {
                oyj oyjVar = (oyj) it2.next();
                oyjVar.g();
                oyjVar.l();
            }
            sgk it3 = this.k.iterator();
            while (it3.hasNext()) {
                ((oyx) it3.next()).a(oyu.AUDIO_TRACK_FAIL_TO_START);
            }
            close();
        }
    }

    public oys(oxm oxmVar, plx plxVar, List list, List list2, pbn pbnVar, owq owqVar, owq owqVar2, oyt oytVar, boolean z) throws oxr {
        oxq oxqVar;
        boolean z2 = false;
        oyp oypVar = new oyp(this);
        this.R = oypVar;
        this.g = plxVar;
        this.i = sbp.j(list);
        this.k = sbp.j(list2);
        this.H = owqVar;
        this.L = owqVar2;
        this.J = oytVar;
        int i = oxmVar.d;
        this.j = i / oxmVar.c;
        if (z && i == 48000) {
            z2 = true;
        }
        this.m = z2;
        int i2 = oxmVar.a.g;
        oxq oxqVar2 = oxq.a;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            oxqVar = oxq.AAC_ELD;
                        } else {
                            throw new IllegalArgumentException("Unsupported audio codec type: " + i2);
                        }
                    } else {
                        oxqVar = oxq.HE_AAC;
                    }
                } else {
                    oxqVar = oxq.AAC;
                }
            } else {
                oxqVar = oxq.AMR_WB;
            }
        } else {
            oxqVar = oxq.a;
        }
        String str = oxqVar.f;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        if (oxqVar.f.equals("audio/mp4a-latm")) {
            mediaFormat.setInteger("aac-profile", 2);
        }
        mediaFormat.setInteger("sample-rate", oxmVar.c);
        mediaFormat.setInteger("channel-count", oxmVar.e);
        mediaFormat.setInteger("bitrate", oxmVar.b);
        MediaCodec mediaCodecQ = nwj.q(oxqVar);
        this.h = mediaCodecQ;
        mediaCodecQ.getClass();
        this.a = ske.A(ojl.bZ(mNLbzhCxd.UPAPVCFzmw));
        this.b = ske.A(ojl.bZ("AEncInput"));
        this.c = ske.A(ojl.bZ("AEncOutput"));
        this.d = ske.A(ojl.bZ("AEncReadAudio"));
        HandlerThread handlerThread = new HandlerThread("AudioEncoder");
        this.D = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.Q = handler;
        mediaCodecQ.setCallback(oypVar, handler);
        mediaCodecQ.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
        this.I = pbnVar;
        this.S = 1;
    }
}
