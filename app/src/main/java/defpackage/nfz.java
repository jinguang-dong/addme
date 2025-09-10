package defpackage;

import android.view.View;
import com.google.ar.core.R;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nfz implements UnaryOperator {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nfz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo30andThen(Function function) {
        return this.b != 0 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        if (this.b == 0) {
            View view = (View) obj;
            return view == null ? ((ngb) this.a).a.a(R.id.viewfinder_cover) : view;
        }
        nbe nbeVar = (nbe) obj;
        nbd nbdVar = new nbd(nbeVar);
        Boolean bool = (Boolean) ((sbv) this.a).get(nbeVar.a);
        bool.getClass();
        nbdVar.f(bool.booleanValue());
        return nbdVar.a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return this.b != 0 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }
}
