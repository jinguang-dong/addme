package defpackage;

import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.OperationApplicationException;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ppq implements ppy {
    private final ppu b;
    private final List a = new ArrayList();
    private boolean c = false;

    public ppq(ppu ppuVar) {
        this.b = ppuVar;
    }

    private final void c(ppw ppwVar, pqe pqeVar) {
        if (pqeVar.c()) {
            if (Uri.EMPTY.equals(ppwVar.h())) {
                Log.w("AndroidQMediaFs", a.bx(pqeVar, "Uri for ", " is still empty. Skipping authority check."));
                return;
            }
            String authority = (prh.A(pqeVar.e) ? this.b.d : this.b.c).getAuthority();
            authority.getClass();
            rnt.P(authority.equals(ppwVar.h().getAuthority()), "Expected URI with authority %s, instead found %s", authority, ppwVar.h());
        }
    }

    @Override // defpackage.ppy
    public final synchronized void a(ppw ppwVar) {
        rnt.L(!this.c);
        c(ppwVar, ppwVar.i());
        this.a.add(new pqk(ppwVar, true, null, null));
    }

    @Override // defpackage.ppy
    public final synchronized void b(ppw ppwVar, pqe pqeVar, pqa pqaVar) {
        boolean z = true;
        rnt.L(!this.c);
        if (ppwVar.i() != pqeVar && !ppwVar.k()) {
            z = false;
        }
        rnt.L(z);
        c(ppwVar, pqeVar);
        this.a.add(new pqk(ppwVar, false, pqeVar, pqaVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ppy, java.lang.AutoCloseable
    public final synchronized void close() {
        qaq qaqVarB;
        if (this.c) {
            throw new IllegalStateException("Cannot publish a closed transaction");
        }
        this.c = true;
        try {
            ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
            List<pqk> list = this.a;
            for (pqk pqkVar : list) {
                ppw ppwVar = pqkVar.a;
                pqe pqeVarI = ppwVar.i();
                ppu ppuVar = this.b;
                File fileB = pqeVarI.b(ppuVar);
                pqe pqeVarI2 = ppwVar.i();
                String str = String.format(Locale.ROOT, "%s.%s", pqeVarI2.c, pqeVarI2.d);
                if (!pqkVar.b) {
                    pqe pqeVar = pqkVar.c;
                    if (pqeVar != null && pqeVar != pqeVarI2) {
                        rnt.M(pqeVarI2.c() == pqeVar.c(), "Can only rename a file within the same type of folder");
                        str = String.format(Locale.ROOT, "%s.%s", pqeVar.c, pqeVar.d);
                        File fileB2 = pqeVar.b(ppuVar);
                        if (!pqeVarI2.c() && fileB.renameTo(fileB2)) {
                            ((pqd) ppwVar).m(new pqj(fileB2, pqeVar));
                        }
                    }
                    if (ppwVar instanceof pqf) {
                        rnt.P(!ppwVar.h().equals(Uri.EMPTY), "Cannot close file that doesn't exist in storage: % operation=%s", ppwVar, pqkVar);
                        ContentProviderOperation.Builder builderNewUpdate = ContentProviderOperation.newUpdate(ppwVar.h());
                        pqa pqaVar = pqkVar.d;
                        if (pqaVar == null) {
                            pqa pqaVar2 = pqa.a;
                            qaqVarB = new qaq((byte[]) null, (byte[]) null);
                        } else {
                            qaqVarB = pqa.b(pqaVar);
                        }
                        qaqVarB.q(ppuVar.e, str);
                        qaqVarB.p(ppuVar.g, 0);
                        pqa pqaVarO = qaqVarB.o();
                        pqkVar.d = pqaVarO;
                        arrayList.add(builderNewUpdate.withValues(pqaVarO.a()).build());
                    }
                } else if (pqeVarI2.c()) {
                    Uri uriH = ppwVar.h();
                    if (uriH.equals(Uri.EMPTY)) {
                        Log.w("AndroidQMediaFs", String.format(Locale.ROOT, "File %s uri is empty. Skipping delete in media store.", fileB));
                    } else {
                        arrayList.add(ContentProviderOperation.newDelete(uriH).build());
                    }
                } else if (!fileB.delete()) {
                    Log.w("AndroidQMediaFs", String.format(Locale.ROOT, "Unable to delete file %s", fileB));
                }
            }
            if (!arrayList.isEmpty()) {
                HashSet hashSet = new HashSet(new ryw(arrayList, new mdv(11)));
                rnt.P(hashSet.size() == 1, "Found multiple incompatible authorities %s when publishing transaction with contentproviderOps=%s", hashSet, arrayList);
                ContentProviderResult[] contentProviderResultArrApplyBatch = this.b.b.applyBatch((String) ujp.aS(hashSet), arrayList);
                rnt.L(contentProviderResultArrApplyBatch.length == arrayList.size());
                for (int i = 0; i < contentProviderResultArrApplyBatch.length; i++) {
                    ContentProviderResult contentProviderResult = contentProviderResultArrApplyBatch[i];
                    if (!((pqk) list.get(i)).b && !arrayList.get(i).isInsert()) {
                        rnt.L(contentProviderResult.count.intValue() == 1);
                    }
                }
            }
        } catch (OperationApplicationException | RemoteException e) {
            throw new IOException("Error inserting MediaStore record.", e);
        }
    }
}
