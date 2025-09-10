package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class epa extends ContextWrapper {
    static final epm a = new eow();
    public final List b;
    public final Map c;
    public final int d;
    public final etl e;
    public final ezh f;
    public final ejs g;
    public final ree h;
    private final far i;
    private ezs j;

    public epa(Context context, etl etlVar, far farVar, ezh ezhVar, Map map, List list, ree reeVar, ejs ejsVar) {
        super(context.getApplicationContext());
        this.e = etlVar;
        this.f = ezhVar;
        this.b = list;
        this.c = map;
        this.h = reeVar;
        this.g = ejsVar;
        this.d = 4;
        this.i = new faq(farVar);
    }

    public final synchronized ezs a() {
        if (this.j == null) {
            ezs ezsVar = new ezs();
            ezsVar.K();
            this.j = ezsVar;
        }
        return this.j;
    }

    public final irt b() {
        return (irt) this.i.a();
    }
}
