package android.support.v8.renderscript;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v8.renderscript.Element;
import android.support.v8.renderscript.Type;
import android.util.Log;
import android.view.Surface;
import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;
import defpackage.a;
import defpackage.mn;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class Allocation extends BaseObj {
    public static final int USAGE_GRAPHICS_TEXTURE = 2;
    public static final int USAGE_IO_INPUT = 32;
    public static final int USAGE_IO_OUTPUT = 64;
    public static final int USAGE_SCRIPT = 1;
    public static final int USAGE_SHARED = 128;
    static BitmapFactory.Options mBitmapOptions;
    Allocation mAdaptedAllocation;
    boolean mAutoPadding;
    Bitmap mBitmap;
    ByteBuffer mByteBuffer;
    long mByteBufferStride;
    boolean mConstrainedFace;
    boolean mConstrainedLOD;
    boolean mConstrainedY;
    boolean mConstrainedZ;
    int mCurrentCount;
    int mCurrentDimX;
    int mCurrentDimY;
    int mCurrentDimZ;
    boolean mIncAllocDestroyed;
    long mIncCompatAllocation;
    boolean mReadAllowed;
    Type.CubemapFace mSelectedFace;
    int mSelectedLOD;
    int mSelectedY;
    int mSelectedZ;
    int mSize;
    public Type mType;
    int mUsage;
    boolean mWriteAllowed;

    /* compiled from: PG */
    /* renamed from: android.support.v8.renderscript.Allocation$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$Config;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            $SwitchMap$android$graphics$Bitmap$Config = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.ARGB_8888.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.RGB_565.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.ARGB_4444.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: PG */
    public enum MipmapControl {
        MIPMAP_NONE(0),
        MIPMAP_FULL(1),
        MIPMAP_ON_SYNC_TO_TEXTURE(2);

        int mID;

        MipmapControl(int i) {
            this.mID = i;
        }
    }

    static {
        BitmapFactory.Options options = new BitmapFactory.Options();
        mBitmapOptions = options;
        options.inScaled = false;
    }

    public Allocation(long j, RenderScript renderScript, Type type, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super(j, renderScript);
        this.mByteBuffer = null;
        this.mByteBufferStride = 0L;
        this.mReadAllowed = true;
        this.mWriteAllowed = true;
        this.mAutoPadding = false;
        this.mSelectedFace = Type.CubemapFace.POSITIVE_X;
        if ((i & (-228)) != 0) {
            throw new RSIllegalArgumentException("Unknown usage specified.");
        }
        if ((i & 32) != 0) {
            this.mWriteAllowed = false;
            if ((i & (-36)) != 0) {
                throw new RSIllegalArgumentException("Invalid usage combination.");
            }
        }
        this.mType = type;
        this.mUsage = i;
        this.mIncCompatAllocation = 0L;
        this.mIncAllocDestroyed = false;
        if (type != null) {
            this.mSize = type.getCount() * this.mType.getElement().getBytesSize();
            updateCacheInfo(type);
        }
        if (RenderScript.sUseGCHooks) {
            try {
                RenderScript.registerNativeAllocation.invoke(RenderScript.sRuntime, Integer.valueOf(this.mSize));
            } catch (Exception e) {
                e.toString();
                Log.e("RenderScript_jni", "Couldn't invoke registerNativeAllocation:".concat(e.toString()));
                e.toString();
                throw new RSRuntimeException("Couldn't invoke registerNativeAllocation:".concat(e.toString()));
            }
        }
    }

    private void copy3DRangeFromUnchecked(int i, int i2, int i3, int i4, int i5, int i6, Object obj, Element.DataType dataType, int i7) {
        boolean z;
        int i8;
        this.mRS.validate();
        validate3DRange(i, i2, i3, i4, i5, i6);
        int bytesSize = this.mType.mElement.getBytesSize() * i4;
        int i9 = dataType.mSize * i7;
        int i10 = bytesSize * i5 * i6;
        if (this.mAutoPadding && this.mType.getElement().getVectorSize() == 3) {
            if ((i10 / 4) * 3 > i9) {
                throw new RSIllegalArgumentException("Array too small for allocation type.");
            }
            i8 = i10;
            z = true;
        } else {
            if (i10 > i9) {
                throw new RSIllegalArgumentException("Array too small for allocation type.");
            }
            z = false;
            i8 = i9;
        }
        this.mRS.nAllocationData3D(getIDSafe(), i, i2, i3, this.mSelectedLOD, i4, i5, i6, obj, i8, dataType, this.mType.mElement.mType.mSize, z);
    }

    public static Allocation createCubemapFromBitmap(RenderScript renderScript, Bitmap bitmap) {
        return createCubemapFromBitmap(renderScript, bitmap, MipmapControl.MIPMAP_NONE, 2);
    }

    public static Allocation createCubemapFromCubeFaces(RenderScript renderScript, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, Bitmap bitmap5, Bitmap bitmap6, MipmapControl mipmapControl, int i) {
        return null;
    }

    public static Allocation createFromBitmap(RenderScript renderScript, Bitmap bitmap) {
        return createFromBitmap(renderScript, bitmap, MipmapControl.MIPMAP_NONE, ScriptIntrinsicBLAS.NON_UNIT);
    }

    public static Allocation createFromBitmapResource(RenderScript renderScript, Resources resources, int i) {
        return createFromBitmapResource(renderScript, resources, i, MipmapControl.MIPMAP_NONE, 3);
    }

    public static Allocation createFromString(RenderScript renderScript, String str, int i) throws UnsupportedEncodingException {
        renderScript.validate();
        try {
            byte[] bytes = str.getBytes("UTF-8");
            Allocation allocationCreateSized = createSized(renderScript, Element.U8(renderScript), bytes.length, i);
            allocationCreateSized.copyFrom(bytes);
            return allocationCreateSized;
        } catch (Exception unused) {
            throw new RSRuntimeException("Could not convert string to utf-8.");
        }
    }

    public static Allocation createSized(RenderScript renderScript, Element element, int i) {
        return createSized(renderScript, element, i, 1);
    }

    public static Allocation createTyped(RenderScript renderScript, Type type) {
        return createTyped(renderScript, type, MipmapControl.MIPMAP_NONE, 1);
    }

    private void data1DChecks(int i, int i2, int i3, int i4, boolean z) {
        this.mRS.validate();
        if (i < 0) {
            throw new RSIllegalArgumentException("Offset must be >= 0.");
        }
        if (i2 <= 0) {
            throw new RSIllegalArgumentException("Count must be >= 1.");
        }
        if (i + i2 <= this.mCurrentCount) {
            if (z) {
                if (i3 < (i4 / 4) * 3) {
                    throw new RSIllegalArgumentException("Array too small for allocation type.");
                }
                return;
            } else {
                if (i3 < i4) {
                    throw new RSIllegalArgumentException("Array too small for allocation type.");
                }
                return;
            }
        }
        throw new RSIllegalArgumentException("Overflow, Available count " + this.mCurrentCount + ", got " + i2 + " at offset " + i + ".");
    }

    static Element elementFromBitmap(RenderScript renderScript, Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        if (config == Bitmap.Config.ALPHA_8) {
            return Element.A_8(renderScript);
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return Element.RGBA_4444(renderScript);
        }
        if (config == Bitmap.Config.ARGB_8888) {
            return Element.RGBA_8888(renderScript);
        }
        if (config == Bitmap.Config.RGB_565) {
            return Element.RGB_565(renderScript);
        }
        Objects.toString(config);
        throw new RSInvalidStateException("Bad bitmap type: ".concat(String.valueOf(config)));
    }

    private long getIDSafe() {
        Allocation allocation = this.mAdaptedAllocation;
        return allocation != null ? allocation.getID(this.mRS) : getID(this.mRS);
    }

    private void setBitmap(Bitmap bitmap) {
        this.mBitmap = bitmap;
    }

    static Type typeFromBitmap(RenderScript renderScript, Bitmap bitmap, MipmapControl mipmapControl) {
        Type.Builder builder = new Type.Builder(renderScript, elementFromBitmap(renderScript, bitmap));
        builder.setX(bitmap.getWidth());
        builder.setY(bitmap.getHeight());
        builder.setMipmaps(mipmapControl == MipmapControl.MIPMAP_FULL);
        return builder.create();
    }

    private void updateCacheInfo(Type type) {
        this.mCurrentDimX = type.getX();
        this.mCurrentDimY = type.getY();
        int z = type.getZ();
        this.mCurrentDimZ = z;
        int i = this.mCurrentDimX;
        this.mCurrentCount = i;
        int i2 = this.mCurrentDimY;
        if (i2 > 1) {
            i *= i2;
            this.mCurrentCount = i;
        }
        if (z > 1) {
            this.mCurrentCount = i * z;
        }
    }

    private void validate2DRange(int i, int i2, int i3, int i4) {
        if (this.mAdaptedAllocation != null) {
            return;
        }
        if (i < 0 || i2 < 0) {
            throw new RSIllegalArgumentException("Offset cannot be negative.");
        }
        if (i4 < 0 || i3 < 0) {
            throw new RSIllegalArgumentException("Height or width cannot be negative.");
        }
        if (i + i3 > this.mCurrentDimX || i2 + i4 > this.mCurrentDimY) {
            throw new RSIllegalArgumentException("Updated region larger than allocation.");
        }
    }

    private void validate3DRange(int i, int i2, int i3, int i4, int i5, int i6) {
        if (this.mAdaptedAllocation != null) {
            return;
        }
        if (i < 0 || i2 < 0 || i3 < 0) {
            throw new RSIllegalArgumentException("Offset cannot be negative.");
        }
        if (i5 < 0 || i4 < 0 || i6 < 0) {
            throw new RSIllegalArgumentException("Height or width cannot be negative.");
        }
        if (i + i4 > this.mCurrentDimX || i2 + i5 > this.mCurrentDimY || i3 + i6 > this.mCurrentDimZ) {
            throw new RSIllegalArgumentException("Updated region larger than allocation.");
        }
    }

    private void validateBitmapFormat(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            throw new RSIllegalArgumentException("Bitmap has an unsupported format for this operation");
        }
        int i = AnonymousClass1.$SwitchMap$android$graphics$Bitmap$Config[config.ordinal()];
        if (i == 1) {
            if (this.mType.getElement().mKind != Element.DataKind.PIXEL_A) {
                throw new RSIllegalArgumentException(mn.a(this, config, new StringBuilder()));
            }
            return;
        }
        if (i == 2) {
            if (this.mType.getElement().mKind != Element.DataKind.PIXEL_RGBA || this.mType.getElement().getBytesSize() != 4) {
                throw new RSIllegalArgumentException(mn.a(this, config, new StringBuilder()));
            }
        } else if (i == 3) {
            if (this.mType.getElement().mKind != Element.DataKind.PIXEL_RGB || this.mType.getElement().getBytesSize() != 2) {
                throw new RSIllegalArgumentException(mn.a(this, config, new StringBuilder()));
            }
        } else {
            if (i != 4) {
                return;
            }
            if (this.mType.getElement().mKind != Element.DataKind.PIXEL_RGBA || this.mType.getElement().getBytesSize() != 2) {
                throw new RSIllegalArgumentException(mn.a(this, config, new StringBuilder()));
            }
        }
    }

    private void validateBitmapSize(Bitmap bitmap) {
        if (this.mCurrentDimX != bitmap.getWidth() || this.mCurrentDimY != bitmap.getHeight()) {
            throw new RSIllegalArgumentException("Cannot update allocation from bitmap, sizes mismatch");
        }
    }

    private void validateIsFloat32() {
        if (this.mType.mElement.mType == Element.DataType.FLOAT_32) {
            return;
        }
        Element.DataType dataType = this.mType.mElement.mType;
        Objects.toString(dataType);
        throw new RSIllegalArgumentException("32 bit float source does not match allocation type ".concat(String.valueOf(dataType)));
    }

    private void validateIsFloat64() {
        if (this.mType.mElement.mType == Element.DataType.FLOAT_64) {
            return;
        }
        Element.DataType dataType = this.mType.mElement.mType;
        Objects.toString(dataType);
        throw new RSIllegalArgumentException("64 bit float source does not match allocation type ".concat(String.valueOf(dataType)));
    }

    private void validateIsInt16() {
        if (this.mType.mElement.mType == Element.DataType.SIGNED_16 || this.mType.mElement.mType == Element.DataType.UNSIGNED_16) {
            return;
        }
        Element.DataType dataType = this.mType.mElement.mType;
        Objects.toString(dataType);
        throw new RSIllegalArgumentException("16 bit integer source does not match allocation type ".concat(String.valueOf(dataType)));
    }

    private void validateIsInt32() {
        if (this.mType.mElement.mType == Element.DataType.SIGNED_32 || this.mType.mElement.mType == Element.DataType.UNSIGNED_32) {
            return;
        }
        Element.DataType dataType = this.mType.mElement.mType;
        Objects.toString(dataType);
        throw new RSIllegalArgumentException("32 bit integer source does not match allocation type ".concat(String.valueOf(dataType)));
    }

    private void validateIsInt64() {
        if (this.mType.mElement.mType == Element.DataType.SIGNED_64 || this.mType.mElement.mType == Element.DataType.UNSIGNED_64) {
            return;
        }
        Element.DataType dataType = this.mType.mElement.mType;
        Objects.toString(dataType);
        throw new RSIllegalArgumentException("64 bit integer source does not match allocation type ".concat(String.valueOf(dataType)));
    }

    private void validateIsInt8() {
        if (this.mType.mElement.mType == Element.DataType.SIGNED_8 || this.mType.mElement.mType == Element.DataType.UNSIGNED_8) {
            return;
        }
        Element.DataType dataType = this.mType.mElement.mType;
        Objects.toString(dataType);
        throw new RSIllegalArgumentException("8 bit integer source does not match allocation type ".concat(String.valueOf(dataType)));
    }

    private void validateIsObject() {
        Element.DataType dataType;
        if (this.mType.mElement.mType == Element.DataType.RS_ELEMENT || (dataType = this.mType.mElement.mType) == Element.DataType.RS_TYPE || dataType == Element.DataType.RS_ALLOCATION || dataType == Element.DataType.RS_SAMPLER || dataType == Element.DataType.RS_SCRIPT) {
            return;
        }
        Element.DataType dataType2 = this.mType.mElement.mType;
        Objects.toString(dataType2);
        throw new RSIllegalArgumentException("Object source does not match allocation type ".concat(String.valueOf(dataType2)));
    }

    private Element.DataType validateObjectIsPrimitiveArray(Object obj, boolean z) {
        Class<?> cls = obj.getClass();
        if (!cls.isArray()) {
            throw new RSIllegalArgumentException("Object passed is not an array of primitives.");
        }
        Class<?> componentType = cls.getComponentType();
        if (!componentType.isPrimitive()) {
            throw new RSIllegalArgumentException("Object passed is not an Array of primitives.");
        }
        if (componentType == Long.TYPE) {
            if (!z) {
                return Element.DataType.SIGNED_64;
            }
            validateIsInt64();
            return this.mType.mElement.mType;
        }
        if (componentType == Integer.TYPE) {
            if (!z) {
                return Element.DataType.SIGNED_32;
            }
            validateIsInt32();
            return this.mType.mElement.mType;
        }
        if (componentType == Short.TYPE) {
            if (!z) {
                return Element.DataType.SIGNED_16;
            }
            validateIsInt16();
            return this.mType.mElement.mType;
        }
        if (componentType == Byte.TYPE) {
            if (!z) {
                return Element.DataType.SIGNED_8;
            }
            validateIsInt8();
            return this.mType.mElement.mType;
        }
        if (componentType == Float.TYPE) {
            if (z) {
                validateIsFloat32();
            }
            return Element.DataType.FLOAT_32;
        }
        if (componentType != Double.TYPE) {
            return null;
        }
        if (z) {
            validateIsFloat64();
        }
        return Element.DataType.FLOAT_64;
    }

    public void copy1DRangeFrom(int i, int i2, Allocation allocation, int i3) {
        this.mRS.nAllocationData2D(getIDSafe(), i, 0, this.mSelectedLOD, this.mSelectedFace.mID, i2, 1, allocation.getID(this.mRS), i3, 0, allocation.mSelectedLOD, allocation.mSelectedFace.mID);
    }

    public void copy1DRangeFromUnchecked(int i, int i2, Object obj) {
        copy1DRangeFromUnchecked(i, i2, obj, validateObjectIsPrimitiveArray(obj, false), Array.getLength(obj));
    }

    public void copy1DRangeTo(int i, int i2, Object obj) {
        copy1DRangeToUnchecked(i, i2, obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copy1DRangeToUnchecked(int i, int i2, Object obj) {
        copy1DRangeToUnchecked(i, i2, obj, validateObjectIsPrimitiveArray(obj, false), Array.getLength(obj));
    }

    public void copy2DRangeFrom(int i, int i2, int i3, int i4, Allocation allocation, int i5, int i6) {
        this.mRS.validate();
        validate2DRange(i, i2, i3, i4);
        this.mRS.nAllocationData2D(getIDSafe(), i, i2, this.mSelectedLOD, this.mSelectedFace.mID, i3, i4, allocation.getID(this.mRS), i5, i6, allocation.mSelectedLOD, allocation.mSelectedFace.mID);
    }

    public void copy2DRangeFromUnchecked(int i, int i2, int i3, int i4, Object obj, Element.DataType dataType, int i5) {
        boolean z;
        int i6;
        this.mRS.validate();
        validate2DRange(i, i2, i3, i4);
        int bytesSize = this.mType.mElement.getBytesSize() * i3;
        int i7 = dataType.mSize * i5;
        int i8 = bytesSize * i4;
        if (this.mAutoPadding && this.mType.getElement().getVectorSize() == 3) {
            if ((i8 / 4) * 3 > i7) {
                throw new RSIllegalArgumentException("Array too small for allocation type.");
            }
            i6 = i8;
            z = true;
        } else {
            if (i8 > i7) {
                throw new RSIllegalArgumentException("Array too small for allocation type.");
            }
            z = false;
            i6 = i7;
        }
        this.mRS.nAllocationData2D(getIDSafe(), i, i2, this.mSelectedLOD, this.mSelectedFace.mID, i3, i4, obj, i6, dataType, this.mType.mElement.mType.mSize, z);
    }

    public void copy2DRangeTo(int i, int i2, int i3, int i4, Object obj) {
        copy2DRangeToUnchecked(i, i2, i3, i4, obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copy2DRangeToUnchecked(int i, int i2, int i3, int i4, Object obj, Element.DataType dataType, int i5) {
        boolean z;
        int i6;
        this.mRS.validate();
        validate2DRange(i, i2, i3, i4);
        int bytesSize = this.mType.mElement.getBytesSize() * i3;
        int i7 = dataType.mSize * i5;
        int i8 = bytesSize * i4;
        if (this.mAutoPadding && this.mType.getElement().getVectorSize() == 3) {
            if ((i8 / 4) * 3 > i7) {
                throw new RSIllegalArgumentException("Array too small for allocation type.");
            }
            i6 = i8;
            z = true;
        } else {
            if (i8 > i7) {
                throw new RSIllegalArgumentException("Array too small for allocation type.");
            }
            z = false;
            i6 = i7;
        }
        this.mRS.nAllocationRead2D(getIDSafe(), i, i2, this.mSelectedLOD, this.mSelectedFace.mID, i3, i4, obj, i6, dataType, this.mType.mElement.mType.mSize, z);
    }

    public void copy3DRangeFrom(int i, int i2, int i3, int i4, int i5, int i6, Allocation allocation, int i7, int i8, int i9) {
        this.mRS.validate();
        validate3DRange(i, i2, i3, i4, i5, i6);
        this.mRS.nAllocationData3D(getIDSafe(), i, i2, i3, this.mSelectedLOD, i4, i5, i6, allocation.getID(this.mRS), i7, i8, i9, allocation.mSelectedLOD);
    }

    public void copyFrom(Bitmap bitmap) throws Throwable {
        this.mRS.validate();
        if (bitmap.getConfig() == null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            copyFrom(bitmapCreateBitmap);
        } else {
            validateBitmapSize(bitmap);
            validateBitmapFormat(bitmap);
            RenderScript renderScript = this.mRS;
            renderScript.nAllocationCopyFromBitmap(getID(renderScript), bitmap);
        }
    }

    public void copyFromUnchecked(Object obj) {
        copyFromUnchecked(obj, validateObjectIsPrimitiveArray(obj, false), Array.getLength(obj));
    }

    public void copyTo(Bitmap bitmap) throws Throwable {
        this.mRS.validate();
        validateBitmapFormat(bitmap);
        validateBitmapSize(bitmap);
        RenderScript renderScript = this.mRS;
        renderScript.nAllocationCopyToBitmap(getID(renderScript), bitmap);
    }

    @Override // android.support.v8.renderscript.BaseObj
    public void destroy() throws Throwable {
        boolean z;
        if (this.mIncCompatAllocation != 0) {
            synchronized (this) {
                if (this.mIncAllocDestroyed) {
                    z = false;
                } else {
                    z = true;
                    this.mIncAllocDestroyed = true;
                }
            }
            if (z) {
                ReentrantReadWriteLock.ReadLock lock = this.mRS.mRWLock.readLock();
                lock.lock();
                if (this.mRS.isAlive()) {
                    this.mRS.nIncObjDestroy(this.mIncCompatAllocation);
                }
                lock.unlock();
                this.mIncCompatAllocation = 0L;
            }
        }
        if ((this.mUsage & 96) != 0) {
            setSurface(null);
        }
        super.destroy();
    }

    @Override // android.support.v8.renderscript.BaseObj
    protected void finalize() throws Throwable {
        if (RenderScript.sUseGCHooks) {
            RenderScript.registerNativeFree.invoke(RenderScript.sRuntime, Integer.valueOf(this.mSize));
        }
        super.finalize();
    }

    public void generateMipmaps() {
        RenderScript renderScript = this.mRS;
        renderScript.nAllocationGenerateMipmaps(getID(renderScript));
    }

    public ByteBuffer getByteBuffer() {
        byte[] bArr;
        int x = this.mType.getX() * this.mType.getElement().getBytesSize();
        if (this.mRS.getDispatchAPILevel() >= 21) {
            if (this.mByteBuffer == null || (this.mUsage & 32) != 0) {
                RenderScript renderScript = this.mRS;
                this.mByteBuffer = renderScript.nAllocationGetByteBuffer(getID(renderScript), x, this.mType.getY(), this.mType.getZ());
            }
            return this.mByteBuffer;
        }
        if (this.mType.getZ() > 0) {
            return null;
        }
        if (this.mType.getY() > 0) {
            bArr = new byte[this.mType.getY() * x];
            copy2DRangeToUnchecked(0, 0, this.mType.getX(), this.mType.getY(), bArr, Element.DataType.SIGNED_8, x * this.mType.getY());
        } else {
            bArr = new byte[x];
            copy1DRangeToUnchecked(0, this.mType.getX(), bArr);
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(bArr).asReadOnlyBuffer();
        this.mByteBufferStride = x;
        return byteBufferAsReadOnlyBuffer;
    }

    public int getBytesSize() {
        Type type = this.mType;
        return type.mDimYuv != 0 ? (int) Math.ceil(type.getCount() * this.mType.getElement().getBytesSize() * 1.5d) : type.getCount() * this.mType.getElement().getBytesSize();
    }

    public Element getElement() {
        return this.mType.getElement();
    }

    public long getIncAllocID() {
        return this.mIncCompatAllocation;
    }

    public long getStride() {
        long j = this.mByteBufferStride;
        if (j != 0) {
            return j;
        }
        if (this.mRS.getDispatchAPILevel() <= 21) {
            long x = this.mType.getX() * this.mType.getElement().getBytesSize();
            this.mByteBufferStride = x;
            return x;
        }
        RenderScript renderScript = this.mRS;
        long jNAllocationGetStride = renderScript.nAllocationGetStride(getID(renderScript));
        this.mByteBufferStride = jNAllocationGetStride;
        return jNAllocationGetStride;
    }

    public Type getType() {
        return this.mType;
    }

    public int getUsage() {
        return this.mUsage;
    }

    public void ioReceive() {
        if ((this.mUsage & 32) == 0) {
            throw new RSIllegalArgumentException("Can only receive if IO_INPUT usage specified.");
        }
        this.mRS.validate();
        RenderScript renderScript = this.mRS;
        renderScript.nAllocationIoReceive(getID(renderScript));
    }

    public void ioSend() {
        if ((this.mUsage & 64) == 0) {
            throw new RSIllegalArgumentException("Can only send buffer if IO_OUTPUT usage specified.");
        }
        this.mRS.validate();
        RenderScript renderScript = this.mRS;
        renderScript.nAllocationIoSend(getID(renderScript));
    }

    public void ioSendOutput() {
        ioSend();
    }

    public void setAutoPadding(boolean z) {
        this.mAutoPadding = z;
    }

    public void setFromFieldPacker(int i, int i2, FieldPacker fieldPacker) {
        this.mRS.validate();
        if (i2 >= this.mType.mElement.mElements.length) {
            throw new RSIllegalArgumentException(a.bE(i2, "Component_number ", " out of range."));
        }
        if (i < 0) {
            throw new RSIllegalArgumentException("Offset must be >= 0.");
        }
        byte[] data = fieldPacker.getData();
        int pos = fieldPacker.getPos();
        int bytesSize = this.mType.mElement.mElements[i2].getBytesSize() * this.mType.mElement.mArraySizes[i2];
        if (pos != bytesSize) {
            throw new RSIllegalArgumentException(a.bD(bytesSize, pos, "Field packer sizelength ", " does not match component size ", "."));
        }
        this.mRS.nAllocationElementData1D(getIDSafe(), i, this.mSelectedLOD, i2, data, pos);
    }

    public void setIncAllocID(long j) {
        this.mIncCompatAllocation = j;
    }

    public void setSurface(Surface surface) throws Throwable {
        this.mRS.validate();
        if ((this.mUsage & 64) == 0) {
            throw new RSInvalidStateException("Allocation is not USAGE_IO_OUTPUT.");
        }
        RenderScript renderScript = this.mRS;
        renderScript.nAllocationSetSurface(getID(renderScript), surface);
    }

    public void syncAll(int i) throws Throwable {
        if (i != 1 && i != 2) {
            throw new RSIllegalArgumentException("Source must be exactly one usage type.");
        }
        this.mRS.validate();
        this.mRS.nAllocationSyncAll(getIDSafe(), i);
    }

    public static Allocation createCubemapFromBitmap(RenderScript renderScript, Bitmap bitmap, MipmapControl mipmapControl, int i) throws Throwable {
        renderScript.validate();
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        if (width % 6 != 0) {
            throw new RSIllegalArgumentException(PNlJufQ.EXCIUkpsBdN);
        }
        if (width / 6 != height) {
            throw new RSIllegalArgumentException("Only square cube map faces supported");
        }
        if (((height - 1) & height) != 0) {
            throw new RSIllegalArgumentException("Only power of 2 cube faces supported");
        }
        Element elementElementFromBitmap = elementFromBitmap(renderScript, bitmap);
        Type.Builder builder = new Type.Builder(renderScript, elementElementFromBitmap);
        builder.setX(height);
        builder.setY(height);
        builder.setFaces(true);
        builder.setMipmaps(mipmapControl == MipmapControl.MIPMAP_FULL);
        Type typeCreate = builder.create();
        long jNAllocationCubeCreateFromBitmap = renderScript.nAllocationCubeCreateFromBitmap(typeCreate.getID(renderScript), mipmapControl.mID, bitmap, i);
        if (jNAllocationCubeCreateFromBitmap != 0) {
            return new Allocation(jNAllocationCubeCreateFromBitmap, renderScript, typeCreate, i);
        }
        throw new RSRuntimeException(a.bC(elementElementFromBitmap, bitmap, "Load failed for bitmap ", " element "));
    }

    public static Allocation createCubemapFromCubeFaces(RenderScript renderScript, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, Bitmap bitmap5, Bitmap bitmap6) {
        MipmapControl mipmapControl = MipmapControl.MIPMAP_NONE;
        return null;
    }

    public static Allocation createFromBitmap(RenderScript renderScript, Bitmap bitmap, MipmapControl mipmapControl, int i) throws Throwable {
        renderScript.validate();
        if (bitmap.getConfig() == null) {
            if ((i & 128) != 0) {
                throw new RSIllegalArgumentException("USAGE_SHARED cannot be used with a Bitmap that has a null config.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            return createFromBitmap(renderScript, bitmapCreateBitmap, mipmapControl, i);
        }
        Type typeTypeFromBitmap = typeFromBitmap(renderScript, bitmap, mipmapControl);
        if (mipmapControl != MipmapControl.MIPMAP_NONE || !typeTypeFromBitmap.getElement().isCompatible(Element.RGBA_8888(renderScript)) || i != 131) {
            long jNAllocationCreateFromBitmap = renderScript.nAllocationCreateFromBitmap(typeTypeFromBitmap.getID(renderScript), mipmapControl.mID, bitmap, i);
            if (jNAllocationCreateFromBitmap != 0) {
                return new Allocation(jNAllocationCreateFromBitmap, renderScript, typeTypeFromBitmap, i);
            }
            throw new RSRuntimeException("Load failed.");
        }
        long jNAllocationCreateBitmapBackedAllocation = renderScript.nAllocationCreateBitmapBackedAllocation(typeTypeFromBitmap.getID(renderScript), mipmapControl.mID, bitmap, ScriptIntrinsicBLAS.NON_UNIT);
        if (jNAllocationCreateBitmapBackedAllocation == 0) {
            throw new RSRuntimeException("Load failed.");
        }
        Allocation allocation = new Allocation(jNAllocationCreateBitmapBackedAllocation, renderScript, typeTypeFromBitmap, ScriptIntrinsicBLAS.NON_UNIT);
        allocation.setBitmap(bitmap);
        return allocation;
    }

    public static Allocation createFromBitmapResource(RenderScript renderScript, Resources resources, int i, MipmapControl mipmapControl, int i2) throws Throwable {
        renderScript.validate();
        if ((i2 & 224) != 0) {
            throw new RSIllegalArgumentException("Unsupported usage specified.");
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, i);
        Allocation allocationCreateFromBitmap = createFromBitmap(renderScript, bitmapDecodeResource, mipmapControl, i2);
        bitmapDecodeResource.recycle();
        return allocationCreateFromBitmap;
    }

    public static Allocation createSized(RenderScript renderScript, Element element, int i, int i2) {
        renderScript.validate();
        Type.Builder builder = new Type.Builder(renderScript, element);
        builder.setX(i);
        Type typeCreate = builder.create();
        long jNAllocationCreateTyped = renderScript.nAllocationCreateTyped(typeCreate.getID(renderScript), MipmapControl.MIPMAP_NONE.mID, i2, 0L);
        if (jNAllocationCreateTyped != 0) {
            return new Allocation(jNAllocationCreateTyped, renderScript, typeCreate, i2);
        }
        throw new RSRuntimeException("Allocation creation failed.");
    }

    public static Allocation createTyped(RenderScript renderScript, Type type, int i) {
        return createTyped(renderScript, type, MipmapControl.MIPMAP_NONE, i);
    }

    public static Allocation createTyped(RenderScript renderScript, Type type, MipmapControl mipmapControl, int i) {
        renderScript.validate();
        if (type.getID(renderScript) != 0) {
            if (!renderScript.usingIO() && (i & 32) != 0) {
                throw new RSRuntimeException("USAGE_IO not supported, Allocation creation failed.");
            }
            long jNAllocationCreateTyped = renderScript.nAllocationCreateTyped(type.getID(renderScript), mipmapControl.mID, i, 0L);
            if (jNAllocationCreateTyped != 0) {
                return new Allocation(jNAllocationCreateTyped, renderScript, type, i);
            }
            throw new RSRuntimeException("Allocation creation failed.");
        }
        throw new RSInvalidStateException("Bad Type");
    }

    private void copy1DRangeFromUnchecked(int i, int i2, Object obj, Element.DataType dataType, int i3) {
        int bytesSize = this.mType.mElement.getBytesSize() * i2;
        boolean z = false;
        if (this.mAutoPadding && this.mType.getElement().getVectorSize() == 3) {
            z = true;
        }
        boolean z2 = z;
        data1DChecks(i, i2, i3 * dataType.mSize, bytesSize, z2);
        this.mRS.nAllocationData1D(getIDSafe(), i, this.mSelectedLOD, i2, obj, bytesSize, dataType, this.mType.mElement.mType.mSize, z2);
    }

    private void copy1DRangeToUnchecked(int i, int i2, Object obj, Element.DataType dataType, int i3) {
        int bytesSize = this.mType.mElement.getBytesSize() * i2;
        boolean z = false;
        if (this.mAutoPadding && this.mType.getElement().getVectorSize() == 3) {
            z = true;
        }
        boolean z2 = z;
        data1DChecks(i, i2, i3 * dataType.mSize, bytesSize, z2);
        this.mRS.nAllocationRead1D(getIDSafe(), i, this.mSelectedLOD, i2, obj, bytesSize, dataType, this.mType.mElement.mType.mSize, z2);
    }

    private void copyFromUnchecked(Object obj, Element.DataType dataType, int i) {
        this.mRS.validate();
        int i2 = this.mCurrentDimZ;
        if (i2 > 0) {
            copy3DRangeFromUnchecked(0, 0, 0, this.mCurrentDimX, this.mCurrentDimY, i2, obj, dataType, i);
            return;
        }
        int i3 = this.mCurrentDimY;
        if (i3 > 0) {
            copy2DRangeFromUnchecked(0, 0, this.mCurrentDimX, i3, obj, dataType, i);
        } else {
            copy1DRangeFromUnchecked(0, this.mCurrentCount, obj, dataType, i);
        }
    }

    public void copy1DRangeFrom(int i, int i2, Object obj) {
        copy1DRangeFromUnchecked(i, i2, obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copy1DRangeTo(int i, int i2, byte[] bArr) {
        validateIsInt8();
        copy1DRangeToUnchecked(i, i2, bArr, Element.DataType.SIGNED_8, bArr.length);
    }

    public void copy2DRangeTo(int i, int i2, int i3, int i4, byte[] bArr) {
        validateIsInt8();
        copy2DRangeToUnchecked(i, i2, i3, i4, bArr, Element.DataType.SIGNED_8, bArr.length);
    }

    public void copyTo(Object obj) {
        copyTo(obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copy1DRangeTo(int i, int i2, float[] fArr) {
        validateIsFloat32();
        copy1DRangeToUnchecked(i, i2, fArr, Element.DataType.FLOAT_32, fArr.length);
    }

    public void copy2DRangeFrom(int i, int i2, int i3, int i4, Object obj) {
        copy2DRangeFromUnchecked(i, i2, i3, i4, obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copy2DRangeTo(int i, int i2, int i3, int i4, float[] fArr) {
        validateIsFloat32();
        copy2DRangeToUnchecked(i, i2, i3, i4, fArr, Element.DataType.FLOAT_32, fArr.length);
    }

    public void copy3DRangeFrom(int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        copy3DRangeFromUnchecked(i, i2, i3, i4, i5, i6, obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copy1DRangeFrom(int i, int i2, byte[] bArr) {
        validateIsInt8();
        copy1DRangeFromUnchecked(i, i2, bArr, Element.DataType.SIGNED_8, bArr.length);
    }

    private void copyTo(Object obj, Element.DataType dataType, int i) {
        this.mRS.validate();
        boolean z = false;
        if (this.mAutoPadding && this.mType.getElement().getVectorSize() == 3) {
            z = true;
        }
        boolean z2 = z;
        if (z2) {
            if (dataType.mSize * i < (this.mSize / 4) * 3) {
                throw new RSIllegalArgumentException("Size of output array cannot be smaller than size of allocation.");
            }
        } else if (dataType.mSize * i < this.mSize) {
            throw new RSIllegalArgumentException("Size of output array cannot be smaller than size of allocation.");
        }
        RenderScript renderScript = this.mRS;
        renderScript.nAllocationRead(getID(renderScript), obj, dataType, this.mType.mElement.mType.mSize, z2);
    }

    public void copy1DRangeFromUnchecked(int i, int i2, byte[] bArr) {
        copy1DRangeFromUnchecked(i, i2, bArr, Element.DataType.SIGNED_8, bArr.length);
    }

    public void copy1DRangeTo(int i, int i2, int[] iArr) {
        validateIsInt32();
        copy1DRangeToUnchecked(i, i2, iArr, Element.DataType.SIGNED_32, iArr.length);
    }

    public void copy1DRangeToUnchecked(int i, int i2, byte[] bArr) {
        copy1DRangeToUnchecked(i, i2, bArr, Element.DataType.SIGNED_8, bArr.length);
    }

    public void copy2DRangeTo(int i, int i2, int i3, int i4, int[] iArr) {
        validateIsInt32();
        copy2DRangeToUnchecked(i, i2, i3, i4, iArr, Element.DataType.SIGNED_32, iArr.length);
    }

    public void copyFromUnchecked(byte[] bArr) {
        copyFromUnchecked(bArr, Element.DataType.SIGNED_8, bArr.length);
    }

    public void copy1DRangeFrom(int i, int i2, float[] fArr) {
        validateIsFloat32();
        copy1DRangeFromUnchecked(i, i2, fArr, Element.DataType.FLOAT_32, fArr.length);
    }

    public void copy1DRangeFromUnchecked(int i, int i2, float[] fArr) {
        copy1DRangeFromUnchecked(i, i2, fArr, Element.DataType.FLOAT_32, fArr.length);
    }

    public void copy1DRangeToUnchecked(int i, int i2, float[] fArr) {
        copy1DRangeToUnchecked(i, i2, fArr, Element.DataType.FLOAT_32, fArr.length);
    }

    public void copy2DRangeFrom(int i, int i2, int i3, int i4, byte[] bArr) {
        validateIsInt8();
        copy2DRangeFromUnchecked(i, i2, i3, i4, bArr, Element.DataType.SIGNED_8, bArr.length);
    }

    public void copyFromUnchecked(float[] fArr) {
        copyFromUnchecked(fArr, Element.DataType.FLOAT_32, fArr.length);
    }

    public void copy1DRangeFromUnchecked(int i, int i2, int[] iArr) {
        copy1DRangeFromUnchecked(i, i2, iArr, Element.DataType.SIGNED_32, iArr.length);
    }

    public void copy1DRangeTo(int i, int i2, short[] sArr) {
        validateIsInt16();
        copy1DRangeToUnchecked(i, i2, sArr, Element.DataType.SIGNED_16, sArr.length);
    }

    public void copy1DRangeToUnchecked(int i, int i2, int[] iArr) {
        copy1DRangeToUnchecked(i, i2, iArr, Element.DataType.SIGNED_32, iArr.length);
    }

    public void copy2DRangeTo(int i, int i2, int i3, int i4, short[] sArr) {
        validateIsInt16();
        copy2DRangeToUnchecked(i, i2, i3, i4, sArr, Element.DataType.SIGNED_16, sArr.length);
    }

    public void copyFrom(Allocation allocation) {
        this.mRS.validate();
        if (this.mType.equals(allocation.getType())) {
            copy2DRangeFrom(0, 0, this.mCurrentDimX, this.mCurrentDimY, allocation, 0, 0);
            return;
        }
        throw new RSIllegalArgumentException("Types of allocations must match.");
    }

    public void copyFromUnchecked(int[] iArr) {
        copyFromUnchecked(iArr, Element.DataType.SIGNED_32, iArr.length);
    }

    public void copy1DRangeFrom(int i, int i2, int[] iArr) {
        validateIsInt32();
        copy1DRangeFromUnchecked(i, i2, iArr, Element.DataType.SIGNED_32, iArr.length);
    }

    public void copy1DRangeFromUnchecked(int i, int i2, short[] sArr) {
        copy1DRangeFromUnchecked(i, i2, sArr, Element.DataType.SIGNED_16, sArr.length);
    }

    public void copy1DRangeToUnchecked(int i, int i2, short[] sArr) {
        copy1DRangeToUnchecked(i, i2, sArr, Element.DataType.SIGNED_16, sArr.length);
    }

    public void copy2DRangeFrom(int i, int i2, int i3, int i4, float[] fArr) {
        validateIsFloat32();
        copy2DRangeFromUnchecked(i, i2, i3, i4, fArr, Element.DataType.FLOAT_32, fArr.length);
    }

    public void copyFromUnchecked(short[] sArr) {
        copyFromUnchecked(sArr, Element.DataType.SIGNED_16, sArr.length);
    }

    public void copy1DRangeFrom(int i, int i2, short[] sArr) {
        validateIsInt16();
        copy1DRangeFromUnchecked(i, i2, sArr, Element.DataType.SIGNED_16, sArr.length);
    }

    public void copy2DRangeFrom(int i, int i2, int i3, int i4, int[] iArr) {
        validateIsInt32();
        copy2DRangeFromUnchecked(i, i2, i3, i4, iArr, Element.DataType.SIGNED_32, iArr.length);
    }

    public void copy2DRangeFrom(int i, int i2, int i3, int i4, short[] sArr) {
        validateIsInt16();
        copy2DRangeFromUnchecked(i, i2, i3, i4, sArr, Element.DataType.SIGNED_16, sArr.length);
    }

    public void copyFrom(Object obj) {
        copyFromUnchecked(obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copy2DRangeFrom(int i, int i2, Bitmap bitmap) {
        this.mRS.validate();
        if (bitmap.getConfig() == null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            copy2DRangeFrom(i, i2, bitmapCreateBitmap);
        } else {
            validateBitmapFormat(bitmap);
            validate2DRange(i, i2, bitmap.getWidth(), bitmap.getHeight());
            this.mRS.nAllocationData2D(getIDSafe(), i, i2, this.mSelectedLOD, this.mSelectedFace.mID, bitmap);
        }
    }

    public void copyTo(byte[] bArr) {
        validateIsInt8();
        copyTo(bArr, Element.DataType.SIGNED_8, bArr.length);
    }

    public void setFromFieldPacker(int i, FieldPacker fieldPacker) {
        this.mRS.validate();
        int bytesSize = this.mType.mElement.getBytesSize();
        byte[] data = fieldPacker.getData();
        int pos = fieldPacker.getPos();
        int i2 = pos / bytesSize;
        if (bytesSize * i2 == pos) {
            copy1DRangeFromUnchecked(i, i2, data);
            return;
        }
        throw new RSIllegalArgumentException(a.bD(bytesSize, pos, "Field packer length ", " not divisible by element size ", "."));
    }

    public void copyFrom(byte[] bArr) {
        validateIsInt8();
        copyFromUnchecked(bArr, Element.DataType.SIGNED_8, bArr.length);
    }

    public void copyTo(float[] fArr) {
        validateIsFloat32();
        copyTo(fArr, Element.DataType.FLOAT_32, fArr.length);
    }

    public void copyFrom(float[] fArr) {
        validateIsFloat32();
        copyFromUnchecked(fArr, Element.DataType.FLOAT_32, fArr.length);
    }

    public void copyTo(int[] iArr) {
        validateIsInt32();
        copyTo(iArr, Element.DataType.SIGNED_32, iArr.length);
    }

    public void copyFrom(int[] iArr) {
        validateIsInt32();
        copyFromUnchecked(iArr, Element.DataType.SIGNED_32, iArr.length);
    }

    public void copyTo(short[] sArr) {
        validateIsInt16();
        copyTo(sArr, Element.DataType.SIGNED_16, sArr.length);
    }

    public void copyFrom(BaseObj[] baseObjArr) {
        this.mRS.validate();
        validateIsObject();
        int length = baseObjArr.length;
        if (length == this.mCurrentCount) {
            if (RenderScript.sPointerSize == 8) {
                long[] jArr = new long[length * 4];
                for (int i = 0; i < baseObjArr.length; i++) {
                    jArr[i * 4] = baseObjArr[i].getID(this.mRS);
                }
                copy1DRangeFromUnchecked(0, this.mCurrentCount, (Object) jArr);
                return;
            }
            int[] iArr = new int[length];
            for (int i2 = 0; i2 < baseObjArr.length; i2++) {
                iArr[i2] = (int) baseObjArr[i2].getID(this.mRS);
            }
            copy1DRangeFromUnchecked(0, this.mCurrentCount, iArr);
            return;
        }
        throw new RSIllegalArgumentException("Array size mismatch, allocation sizeX = " + this.mCurrentCount + ", array length = " + length);
    }

    public void copyFrom(short[] sArr) {
        validateIsInt16();
        copyFromUnchecked(sArr, Element.DataType.SIGNED_16, sArr.length);
    }
}
