package defpackage;

import android.net.Uri;
import java.io.OutputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rdr implements rch {
    public sdy[] a;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, rds] */
    @Override // defpackage.rch
    public final /* bridge */ /* synthetic */ Object a(rcg rcgVar) {
        List listA = rcgVar.a(rcgVar.b.p((Uri) rcgVar.f));
        sdy[] sdyVarArr = this.a;
        if (sdyVarArr != null) {
            sdyVarArr[0].c(listA);
        }
        return (OutputStream) listA.get(0);
    }
}
