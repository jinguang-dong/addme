package j$.util.stream;

/* loaded from: classes3.dex */
public final class d2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Runnable runnable = (Runnable) this.c;
                try {
                    ((Runnable) this.b).run();
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    try {
                        runnable.run();
                    } catch (Throwable th2) {
                        try {
                            th.addSuppressed(th2);
                        } catch (Throwable unused) {
                        }
                    }
                    throw th;
                }
            default:
                BaseStream baseStream = (BaseStream) this.c;
                try {
                    ((BaseStream) this.b).close();
                    baseStream.close();
                    return;
                } catch (Throwable th3) {
                    try {
                        baseStream.close();
                    } catch (Throwable th4) {
                        try {
                            th3.addSuppressed(th4);
                        } catch (Throwable unused2) {
                        }
                    }
                    throw th3;
                }
        }
    }
}
