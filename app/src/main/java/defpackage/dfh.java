package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class dfh implements uiw {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dfh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [dfg, java.lang.Object] */
    @Override // defpackage.uiw
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        if (this.b == 0) {
            SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
            String[] strArr = dfj.a;
            sQLiteQuery.getClass();
            this.a.h(new dfp(sQLiteQuery));
            return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
        }
        cgo cgoVar = (cgo) this.a;
        bbo bboVarJ = cgoVar.g.J((cfd) obj, (cfp) obj2);
        if (bboVarJ instanceof cfx) {
            Object obj5 = ((cfx) bboVarJ).a;
            obj5.getClass();
            return (Typeface) obj5;
        }
        tdy tdyVar = new tdy(bboVarJ, cgoVar.f);
        cgoVar.f = tdyVar;
        Object obj6 = tdyVar.b;
        obj6.getClass();
        return (Typeface) obj6;
    }
}
