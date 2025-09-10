package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ouz implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    private final Object c;

    public ouz(Object obj, Object obj2, int i) {
        this.b = i;
        this.a = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            try {
                this.c.run();
                return;
            } catch (Throwable th) {
                Object obj = this.a;
                ((ouy) obj).b.execute(new ooc(th, 6, null));
                return;
            }
        }
        try {
            ske.U(this.c);
        } catch (ExecutionException e) {
            Object obj2 = this.a;
            ((ovb) obj2).a.execute(new ooc(e, 7));
        } catch (Throwable th2) {
            Object obj3 = this.a;
            ((ovb) obj3).a.execute(new ooc(th2, 8));
        }
    }
}
