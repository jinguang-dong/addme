package defpackage;

import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdz extends Thread {
    public final ArrayBlockingQueue a = new ArrayBlockingQueue(50);
    public boolean b = false;
    private jfk c = null;
    private Boolean d = false;

    public final synchronized void a(jfk jfkVar) {
        if (isInterrupted() || !isAlive()) {
            throw new RuntimeException("IncrementalAligner is already shut down.");
        }
        this.c = jfkVar;
        this.d = true;
        super.interrupt();
    }

    @Override // java.lang.Thread
    public final void interrupt() {
        this.a.add("Poison Pill");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (!isInterrupted()) {
            ArrayList arrayList = new ArrayList();
            boolean z = true;
            try {
                ArrayBlockingQueue arrayBlockingQueue = this.a;
                String str = (String) arrayBlockingQueue.take();
                this.b = true;
                arrayList.add(str);
                while (!arrayBlockingQueue.isEmpty()) {
                    arrayList.add((String) arrayBlockingQueue.take());
                }
            } catch (InterruptedException unused) {
                interrupt();
            }
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                } else {
                    if ("Poison Pill".equals((String) arrayList.get(i)) || this.d.booleanValue()) {
                        break;
                    }
                    Object obj = jeb.a;
                    LightCycleNative.AlignNextImage();
                    i++;
                }
            }
            this.b = false;
            if (z) {
                break;
            }
        }
        jfk jfkVar = this.c;
        if (jfkVar != null) {
            jfkVar.a(null);
        }
    }
}
