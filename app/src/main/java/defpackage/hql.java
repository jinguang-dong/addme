package defpackage;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hql implements hqi {
    private final hqw a;

    public hql(hqw hqwVar) {
        this.a = hqwVar;
    }

    @Override // defpackage.hqi
    public final Cursor a(Uri uri, String[] strArr) {
        long jZ = ezh.Z(uri);
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"special_type_id"});
        rwc rwcVarA = this.a.a(jZ);
        if (rwcVarA.h() && !((hqp) rwcVarA.c()).equals(hqp.NONE)) {
            matrixCursor.addRow(new Object[]{((hqp) rwcVarA.c()).e()});
        }
        if (rwcVarA.h()) {
            rwcVarA.c();
        }
        return matrixCursor;
    }
}
