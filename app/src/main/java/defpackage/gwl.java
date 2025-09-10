package defpackage;

import android.hardware.camera2.CaptureResult;
import android.util.Range;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gwl implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gwl(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo30andThen(Function function) {
        switch (this.b) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, pnx] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, pnx] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, pnx] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, pnx] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, pjp] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, pjp] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                int i = gwv.Y;
                return this.a.a(obj);
            case 1:
                return ske.P((mcw) obj, this.a);
            case 2:
                return this.a.a((pjr) obj);
            case 3:
                return this.a.a((pjr) obj);
            case 4:
                Range range = (Range) ((sbv) this.a).get((pjr) obj);
                range.getClass();
                return range;
            case 5:
                return this.a.a(obj);
            case 6:
                return (Integer) this.a.a((CaptureResult.Key) obj);
            case 7:
                return (float[]) this.a.a((CaptureResult.Key) obj);
            case 8:
                return (int[]) this.a.a((CaptureResult.Key) obj);
            case 9:
                return (byte[]) this.a.a((CaptureResult.Key) obj);
            case 10:
                return ((smx) this.a).a.a;
            default:
                return ((smx) this.a).b.a;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.b) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
