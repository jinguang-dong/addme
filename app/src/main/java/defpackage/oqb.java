package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oqb extends ohd implements ofc {
    private final Status b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqb(DataHolder dataHolder, int i, byte[] bArr) {
        super(dataHolder);
        this.c = i;
        this.b = new Status(dataHolder.e);
    }

    @Override // defpackage.ofc
    public final Status a() {
        int i = this.c;
        return this.b;
    }

    @Override // defpackage.ohd
    protected final /* synthetic */ Object e(int i, int i2) {
        return this.c != 0 ? new orj(this.a, i, i2) : new orl(this.a, i, i2);
    }

    @Override // defpackage.ohd
    protected final String f() {
        return "path";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqb(DataHolder dataHolder, int i) {
        super(dataHolder);
        this.c = i;
        this.b = new Status(dataHolder.e);
    }
}
