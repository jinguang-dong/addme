package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oyx implements paq {
    public final String d;
    private final Handler k;
    private Future m;
    private final syx j = ske.B(ojl.cb("EncWatch", 1));
    public final Object c = new Object();
    public rwc e = rvk.a;
    public volatile boolean f = false;
    private volatile boolean l = false;
    public volatile long g = 0;
    public volatile long h = 0;
    public volatile long i = 0;
    public final Map b = new HashMap();
    public final Map a = new HashMap();

    public oyx(Set set, Handler handler, rwc rwcVar) {
        this.d = "EncWatcher".concat((String) rwcVar.e(""));
        this.k = handler;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.a.put((oym) it.next(), false);
        }
    }

    public static final oyu h(oym oymVar, int i) {
        if (i - 1 != 0) {
            int iOrdinal = oymVar.ordinal();
            if (iOrdinal == 0) {
                return oyu.AUDIO_BUFFER_DELAY;
            }
            if (iOrdinal == 1) {
                return oyu.VIDEO_BUFFER_DELAY;
            }
            if (iOrdinal == 2 || iOrdinal == 3) {
                return oyu.METADATA_DELAY;
            }
        } else {
            int iOrdinal2 = oymVar.ordinal();
            if (iOrdinal2 == 0) {
                return oyu.AUDIO_TRACK_FAIL_TO_START;
            }
            if (iOrdinal2 == 1) {
                return oyu.VIDEO_TRACK_FAIL_TO_START;
            }
            if (iOrdinal2 == 2 || iOrdinal2 == 3) {
                return oyu.METADATA_DELAY;
            }
        }
        return oyu.OTHER;
    }

    private final void i() {
        synchronized (this.c) {
            if (this.m == null) {
                String.valueOf(this.a.keySet());
                this.m = this.j.f(new ooc(this, 15), 0L, 1000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void a(oyu oyuVar) {
        Log.w(this.d, "Found error: ".concat(String.valueOf(String.valueOf(oyuVar))));
        synchronized (this.c) {
            if (oyuVar == oyu.AUDIO_TRACK_FAIL_TO_START) {
                this.a.remove(oym.AUDIO);
            }
        }
        if (this.e.h()) {
            this.k.post(new nzq(this, oyuVar, 18));
        }
    }

    public final void b(long j) {
        if (this.f) {
            return;
        }
        this.g = j;
        synchronized (this.c) {
            Future future = this.m;
            if (future != null) {
                future.cancel(true);
                this.m = null;
            }
        }
    }

    public final void c(long j) {
        if (this.f) {
            return;
        }
        synchronized (this.c) {
            if (this.g == 0) {
                Log.w(this.d, "Resume without pause");
                return;
            }
            long j2 = j - this.g;
            if (j2 >= 0) {
                this.h += j2;
            } else {
                Log.e(this.d, "Pause duration is negative: " + this.h);
            }
            this.g = 0L;
            i();
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.c) {
            if (!this.f) {
                this.f = true;
                this.j.shutdown();
            }
        }
    }

    public final void d(oyv oyvVar) {
        this.e = rwc.i(oyvVar);
    }

    public final void e(oym oymVar, AtomicLong atomicLong) {
        if (this.f) {
            return;
        }
        synchronized (this.c) {
            Map map = this.a;
            if (!map.containsKey(oymVar)) {
                Log.w(this.d, eld.b(oymVar, "Unexpected track was started: "));
                return;
            }
            String.valueOf(oymVar);
            atomicLong.get();
            map.put(oymVar, true);
            this.b.put(oymVar, atomicLong);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                ((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue();
            }
        }
    }

    public final void f() {
        if (this.f) {
            return;
        }
        synchronized (this.c) {
            this.i = TimeUnit.MILLISECONDS.toMicros(SystemClock.uptimeMillis());
            i();
        }
    }

    public final boolean g(oym oymVar) {
        if (this.f) {
            return false;
        }
        synchronized (this.c) {
            Map map = this.a;
            if (!map.containsKey(oymVar)) {
                return false;
            }
            return ((Boolean) map.get(oymVar)).booleanValue();
        }
    }
}
