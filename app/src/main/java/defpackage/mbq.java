package defpackage;

import android.content.Context;
import android.media.SoundPool;
import android.util.Pair;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mbq implements paq {
    public static final sgv a = sgv.g("mbq");
    private final Context f;
    private final Executor g;
    private SoundPool h;
    private final owf i;
    private final uem j;
    public final Collection e = new sab(5);
    private final SoundPool.OnLoadCompleteListener k = new mbn(this);
    public final Object b = new Object();
    public final Map c = new HashMap();
    public boolean d = false;

    public mbq(Context context, owf owfVar, uem uemVar, Executor executor) {
        this.f = context;
        this.i = owfVar;
        this.j = uemVar;
        this.g = executor;
    }

    private final syu n(ggg gggVar) {
        synchronized (this.b) {
            if (this.d) {
                return ske.M(false);
            }
            mbp mbpVarL = l(gggVar);
            if (mbpVarL == null) {
                Object obj = gggVar.a;
                mbp mbpVar = new mbp();
                mbpVar.c = gggVar;
                this.c.put(gggVar, mbpVar);
                if (obj instanceof Integer) {
                    mbpVar.a = a().load(this.f, ((Integer) obj).intValue(), 1);
                } else {
                    if (!(obj instanceof String)) {
                        throw new IllegalArgumentException("unsupported resource type");
                    }
                    SoundPool soundPoolA = a();
                    obj.getClass();
                    mbpVar.a = soundPoolA.load((String) obj, 1);
                }
                mbpVarL = mbpVar;
            }
            return mbpVarL.b;
        }
    }

    private final void o(ggg gggVar) {
        ggg gggVar2;
        Object obj = this.b;
        synchronized (obj) {
            if (this.d) {
                return;
            }
            mbp mbpVarL = l(gggVar);
            if (mbpVarL == null) {
                return;
            }
            Map map = this.c;
            synchronized (obj) {
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        gggVar2 = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (mbpVarL == entry.getValue()) {
                        gggVar2 = (ggg) entry.getKey();
                        break;
                    }
                }
                map.remove(gggVar2);
                a().unload(mbpVarL.a);
            }
        }
    }

    public final SoundPool a() {
        if (this.h == null && !this.d) {
            SoundPool soundPool = (SoundPool) this.j.a();
            this.h = soundPool;
            rnt.x(soundPool);
            soundPool.setOnLoadCompleteListener(this.k);
        }
        SoundPool soundPool2 = this.h;
        rnt.x(soundPool2);
        return soundPool2;
    }

    public final syu b(int i) {
        return n(new ggg(Integer.valueOf(i), (byte[]) null));
    }

    public final syu c(String str) {
        return n(new ggg(str, (byte[]) null));
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.b) {
            if (this.d) {
                return;
            }
            this.d = true;
            if (this.h != null) {
                this.c.clear();
                SoundPool soundPool = this.h;
                rnt.x(soundPool);
                soundPool.autoPause();
                SoundPool soundPool2 = this.h;
                rnt.x(soundPool2);
                soundPool2.release();
                this.h = null;
            }
        }
    }

    public final void d(int i) {
        Object obj = this.b;
        synchronized (obj) {
            if (this.d) {
                return;
            }
            Pair pair = null;
            for (Pair pair2 : this.e) {
                if ((((ggg) pair2.second).a instanceof Integer) && ((Integer) ((ggg) pair2.second).a).intValue() == i) {
                    pair = new Pair((Integer) pair2.first, (ggg) pair2.second);
                } else {
                    synchronized (obj) {
                        a().setVolume(((Integer) pair2.first).intValue(), 0.0f, 0.0f);
                    }
                }
            }
            Collection collection = this.e;
            collection.clear();
            if (pair != null) {
                collection.add(pair);
            }
        }
    }

    public final void e() {
        synchronized (this.b) {
            if (!this.d) {
                a().autoPause();
            }
        }
    }

    public final void f(int i) {
        m(new ggg(Integer.valueOf(i), (byte[]) null), 0.0f, true);
    }

    public final void g() {
        this.g.execute(new lac(this, 11));
    }

    public final void h() {
        Object obj = this.b;
        synchronized (obj) {
            if (this.d) {
                return;
            }
            for (Pair pair : this.e) {
                synchronized (obj) {
                    a().stop(((Integer) pair.first).intValue());
                }
            }
            this.e.clear();
        }
    }

    public final void i(int i, float f) {
        m(new ggg(Integer.valueOf(i), (byte[]) null), f, false);
    }

    public final void j(int i) {
        o(new ggg(Integer.valueOf(i), (byte[]) null));
    }

    public final void k(String str) {
        o(new ggg(str, (byte[]) null));
    }

    public final mbp l(ggg gggVar) {
        synchronized (this.b) {
            for (Map.Entry entry : this.c.entrySet()) {
                Object obj = gggVar.a;
                obj.getClass();
                if (obj.equals(((ggg) entry.getKey()).a)) {
                    return (mbp) entry.getValue();
                }
            }
            return null;
        }
    }

    public final void m(ggg gggVar, float f, boolean z) {
        syu syuVarC;
        int[] iArr = {-1};
        if (((Boolean) this.i.dL()).booleanValue() || z) {
            Object obj = gggVar.a;
            if (obj instanceof Integer) {
                syuVarC = b(((Integer) obj).intValue());
            } else {
                if (!(obj instanceof String)) {
                    throw new IllegalArgumentException("unsupported resource type");
                }
                obj.getClass();
                syuVarC = c((String) obj);
            }
            ske.W(syuVarC, new mbo(this, gggVar, iArr, f), this.g);
        }
    }
}
