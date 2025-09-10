package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class qci implements sxi {
    private final /* synthetic */ int a;

    public /* synthetic */ qci(int i) {
        this.a = i;
    }

    @Override // defpackage.sxi
    public final syu a(Object obj) throws qah, IOException {
        int i = this.a;
        if (i == 0) {
            return ske.M(null);
        }
        if (i == 1) {
            qah qahVar = new qah();
            if (((Boolean) obj).booleanValue()) {
                throw qahVar;
            }
            throw new IOException("failed to save sharedFilesMetadata", qahVar);
        }
        if (i != 2) {
            if (i != 3) {
                return ske.M("");
            }
            return syq.a;
        }
        rwc rwcVar = (rwc) obj;
        if (rwcVar.h()) {
            int i2 = qbu.a;
            ((syu) rwcVar.c()).cancel(false);
        }
        return syq.a;
    }
}
