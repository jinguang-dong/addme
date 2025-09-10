package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eul implements eqa {
    @Override // defpackage.eqa
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, eqm eqmVar) throws Throwable {
        try {
            fak.c((ByteBuffer) obj, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
