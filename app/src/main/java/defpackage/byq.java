package defpackage;

import android.view.Choreographer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byq implements Choreographer.FrameCallback, Runnable {
    final /* synthetic */ byr a;

    public byq(byr byrVar) {
        this.a = byrVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        byr byrVar = this.a;
        byrVar.d.removeCallbacks(this);
        byrVar.b();
        synchronized (byrVar.e) {
            if (byrVar.h) {
                byrVar.h = false;
                List list = byrVar.f;
                byrVar.f = byrVar.g;
                byrVar.g = list;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) list.get(i)).doFrame(j);
                }
                list.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byr byrVar = this.a;
        byrVar.b();
        synchronized (byrVar.e) {
            if (byrVar.f.isEmpty()) {
                byrVar.c.removeFrameCallback(this);
                byrVar.h = false;
            }
        }
    }
}
