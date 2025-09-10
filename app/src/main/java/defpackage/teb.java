package defpackage;

import android.graphics.Bitmap;
import android.opengl.Matrix;
import android.util.Size;
import j$.util.Map;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class teb implements Function {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ teb(fkz fkzVar, float[] fArr, qjn qjnVar, qim qimVar, int i) {
        this.e = i;
        this.b = fkzVar;
        this.a = fArr;
        this.d = qjnVar;
        this.c = qimVar;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo30andThen(Function function) {
        return this.e != 0 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        fky fkyVar;
        if (this.e == 0) {
            return ((teg) this.a).c.a((foy) obj, (Size) this.b, (tdv) this.c, ((tef) this.d).a);
        }
        tfo tfoVar = (tfo) obj;
        Bitmap bitmap = tfoVar.b;
        Object obj2 = this.b;
        synchronized (obj2) {
            fkyVar = (fky) Map.EL.computeIfAbsent(((fkz) obj2).b, bitmap, new fmu(obj2, tfoVar, 1));
        }
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.a;
        fkz fkzVar = (fkz) obj2;
        float[] fArr = fkzVar.c;
        Matrix.multiplyMM(fArr, 0, (float[]) obj5, 0, tfoVar.a, 0);
        qjn qjnVar = (qjn) obj4;
        qfq qfqVar = ((qhx) qjnVar.c()).a;
        qji qjiVarA = qji.n(5, fkyVar.b).a(fkzVar.d);
        qjiVarA.c("a_BitmapLocalPosition", 0);
        qjiVarA.c("a_BitmapTexCoord", 1);
        qjiVarA.e("u_BitmapTexture", fkyVar.a);
        qjiVarA.f("u_BitmapOpacity", 0.8f);
        qjiVarA.g("u_ModelViewProjection", (float[]) fArr.clone());
        qjiVarA.d("u_ViewfinderTexture", qjnVar);
        qjiVarA.h("u_ViewfinderSize", qfqVar.b(), qfqVar.a());
        qjiVarA.a((qim) obj3);
        return bitmap;
    }

    public final /* synthetic */ Function compose(Function function) {
        return this.e != 0 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ teb(teg tegVar, Size size, tdv tdvVar, tef tefVar, int i) {
        this.e = i;
        this.a = tegVar;
        this.b = size;
        this.c = tdvVar;
        this.d = tefVar;
    }
}
