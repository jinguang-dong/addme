package j$.util.stream;

import java.util.HashSet;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0071i extends Y0 {
    public final /* synthetic */ int b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0071i(InterfaceC0079k1 interfaceC0079k1) {
        super(interfaceC0079k1);
        this.b = 0;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                if (!((HashSet) this.c).contains(obj)) {
                    ((HashSet) this.c).add(obj);
                    ((InterfaceC0079k1) this.a).accept((InterfaceC0079k1) obj);
                    break;
                }
                break;
            case 1:
                if (((Predicate) this.c).test(obj)) {
                    ((InterfaceC0079k1) this.a).accept((InterfaceC0079k1) obj);
                    break;
                }
                break;
            case 2:
                ((InterfaceC0079k1) this.a).accept((InterfaceC0079k1) ((Function) this.c).apply(obj));
                break;
            case 3:
                ((InterfaceC0079k1) this.a).accept(((ToIntFunction) this.c).applyAsInt(obj));
                break;
            case 4:
                ((InterfaceC0079k1) this.a).accept(((ToLongFunction) this.c).applyAsLong(obj));
                break;
            default:
                ((InterfaceC0079k1) this.a).accept(((ToDoubleFunction) this.c).applyAsDouble(obj));
                break;
        }
    }

    @Override // j$.util.stream.Y0, j$.util.stream.InterfaceC0079k1
    public void c(long j) {
        switch (this.b) {
            case 0:
                this.c = new HashSet();
                ((InterfaceC0079k1) this.a).c(-1L);
                break;
            case 1:
                ((InterfaceC0079k1) this.a).c(-1L);
                break;
            default:
                super.c(j);
                break;
        }
    }

    @Override // j$.util.stream.Y0, j$.util.stream.InterfaceC0079k1
    public void end() {
        switch (this.b) {
            case 0:
                this.c = null;
                ((InterfaceC0079k1) this.a).end();
                break;
            default:
                super.end();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0071i(InterfaceC0079k1 interfaceC0079k1, Object obj, int i) {
        super(interfaceC0079k1);
        this.b = i;
        this.c = obj;
    }
}
