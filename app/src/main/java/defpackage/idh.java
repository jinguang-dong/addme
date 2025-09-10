package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.function.Function;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class idh implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ idh(Object obj, int i) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, pnx] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, pnx] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, pnx] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, pnx] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, pvu] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, pjo] */
    /* JADX WARN: Type inference failed for: r2v43, types: [java.lang.Object, pdk] */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.lang.Object, pnx] */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r2v50, types: [java.lang.Object, pnx] */
    /* JADX WARN: Type inference failed for: r2v53, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v56, types: [java.lang.Object, pnx] */
    /* JADX WARN: Type inference failed for: r2v59, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v62, types: [java.lang.Object, pjo] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, pnx] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (byte[]) this.a.a((CaptureResult.Key) obj);
            case 1:
                return (float[]) this.a.m((CameraCharacteristics.Key) obj);
            case 2:
                return (Boolean) this.a.a((CaptureResult.Key) obj);
            case 3:
                return (Integer) this.a.a((CaptureResult.Key) obj);
            case 4:
                return (byte[]) this.a.a((CaptureResult.Key) obj);
            case 5:
                return (Boolean) this.a.a((CaptureResult.Key) obj);
            case 6:
                return (iqy) ((sbv) this.a).get((isj) obj);
            case 7:
                return new hed(new fjw(this.a, (mcw) obj, 10), 4);
            case 8:
                return Boolean.valueOf(((mgh) ((jdf) this.a).d.a()).a());
            case 9:
                return ((puq) obj).a(((hbp) this.a).b);
            case 10:
                return Boolean.valueOf(((Integer) this.a).equals((Integer) obj));
            case 11:
                pdo pdoVarB = ((phc) obj).b();
                pdoVarB.getClass();
                return ((pgx) this.a).c(pdoVarB.b);
            case 12:
                return this.a.e((peo) obj);
            case 13:
                return (byte[]) this.a.a((CaptureResult.Key) obj);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return this.a.a(obj);
            case 15:
                return (Integer) this.a.a((CaptureResult.Key) obj);
            case 16:
                return (Integer) this.a.get(((Integer) obj).intValue());
            case 17:
                return (Integer) this.a.a((CaptureResult.Key) obj);
            case 18:
                return (Long) this.a.get(((Integer) obj).intValue());
            case 19:
                return (Float) this.a.m((CameraCharacteristics.Key) obj);
            default:
                return mdo.g((szh) obj, (Instant) this.a);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.b) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
