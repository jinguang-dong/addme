package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Function;

/* renamed from: j$.util.stream.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0068h extends Y0 {
    public final /* synthetic */ int b = 0;
    public boolean c;
    public Object d;

    public /* synthetic */ C0068h(InterfaceC0079k1 interfaceC0079k1) {
        super(interfaceC0079k1);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                InterfaceC0079k1 interfaceC0079k1 = (InterfaceC0079k1) this.a;
                if (obj == null) {
                    if (this.c) {
                        return;
                    }
                    this.c = true;
                    this.d = null;
                    interfaceC0079k1.accept((InterfaceC0079k1) null);
                    return;
                }
                Object obj2 = this.d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.d = obj;
                    interfaceC0079k1.accept((InterfaceC0079k1) obj);
                    return;
                }
                return;
            default:
                InterfaceC0079k1 interfaceC0079k12 = (InterfaceC0079k1) this.a;
                Stream stream = (Stream) ((Function) this.d).apply(obj);
                if (stream != null) {
                    try {
                        if (this.c) {
                            Spliterator<T> spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!interfaceC0079k12.e() && spliterator.tryAdvance(interfaceC0079k12)) {
                            }
                        } else {
                            ((Stream) stream.sequential()).forEach(interfaceC0079k12);
                        }
                    } catch (Throwable th) {
                        try {
                            stream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.Y0, j$.util.stream.InterfaceC0079k1
    public final void c(long j) {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                ((InterfaceC0079k1) this.a).c(-1L);
                break;
            default:
                ((InterfaceC0079k1) this.a).c(-1L);
                break;
        }
    }

    @Override // j$.util.stream.Y0, j$.util.stream.InterfaceC0079k1
    public boolean e() {
        switch (this.b) {
            case 1:
                this.c = true;
                return ((InterfaceC0079k1) this.a).e();
            default:
                return super.e();
        }
    }

    @Override // j$.util.stream.Y0, j$.util.stream.InterfaceC0079k1
    public void end() {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                ((InterfaceC0079k1) this.a).end();
                break;
            default:
                super.end();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0068h(InterfaceC0079k1 interfaceC0079k1, Function function) {
        super(interfaceC0079k1);
        this.d = function;
    }
}
