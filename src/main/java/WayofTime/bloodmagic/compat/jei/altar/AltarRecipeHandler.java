package WayofTime.bloodmagic.compat.jei.altar;

import javax.annotation.Nonnull;

import mezz.jei.api.recipe.IRecipeHandler;
import mezz.jei.api.recipe.IRecipeWrapper;
import WayofTime.bloodmagic.api.Constants;

public class AltarRecipeHandler implements IRecipeHandler<AltarRecipeJEI>
{
    @Nonnull
    @Override
    public Class<AltarRecipeJEI> getRecipeClass()
    {
        return AltarRecipeJEI.class;
    }

    @Override
    public String getRecipeCategoryUid(@Nonnull AltarRecipeJEI recipe)
    {
        return Constants.Compat.JEI_CATEGORY_ALTAR;
    }

    @Nonnull
    @Override
    public IRecipeWrapper getRecipeWrapper(@Nonnull AltarRecipeJEI recipe)
    {
        return recipe;
    }

    @Override
    public boolean isRecipeValid(@Nonnull AltarRecipeJEI recipe)
    {
        return true;
    }

    @Override
    public String getRecipeCategoryUid() {
        return null;
    }
}
